package com.sparks.springbootstarter.bookLibrary.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {

	
	@Autowired
	private BooksService booksService1;
	@Autowired
	private BooksService booksService2;
	@Autowired
	private BooksService booksService3;
	@Autowired
	private BooksService booksService4;
	@RequestMapping("/books/History")
	public List<HistoryBook> getAllHistoryBooks()
	{
		return (List<HistoryBook>) booksService1.getAllHistoryBooks();
	}
	
	
	@RequestMapping("/books/History/{id}")
	public HistoryBook getHistoryBook(@PathVariable String id)
	{
		return (HistoryBook) booksService1.getHistoryBook(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/books/History")
	public void addHistoryBook(@RequestBody HistoryBook Hbook) {
		booksService1.addHistoryBook(Hbook);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/books/History/{id}")
	public void updateHistoryBook(@RequestBody HistoryBook Hbook, @PathVariable String id) {
		booksService1.updateHistoryBook(id, Hbook);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/books/History/{id}")
	public void deleteHistoryBook(@RequestBody HistoryBook Hbook, @PathVariable String id) {
		booksService1.deleteHistoryBook(id);
	}
	
	@RequestMapping("/books/Biography")
	public List<BiographyBook> getAllBiographyBooks()
	{
		return booksService2.getAllBiographyBooks();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/books/Biography")
	public void addBiographyBook(@RequestBody BiographyBook Bbook) {
		booksService2.addBiographyBook(Bbook);
		
		
	}
	@RequestMapping("/books/Biography/{id}")
	public BiographyBook getBiographyBook(@PathVariable String id)
	{
		return (BiographyBook) booksService2.getBiographyBook(id);
	}
	
	

	@RequestMapping(method=RequestMethod.PUT,value="/books/Biography/{id}")
	public void updateBiographyBook(@RequestBody BiographyBook Bbook, @PathVariable String id) {
		booksService2.updateBiographyBook(id, Bbook);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/books/Biography/{id}")
	public void deleteBiographyBook(@RequestBody BiographyBook Bbook, @PathVariable String id) {
		booksService2.deleteBiographyBook(id);
	}
	
	@RequestMapping("/books/Science")
	public List<ScienceBook> getAllScienceBooks()
	{
		return booksService3.getAllScienceBooks();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/books/Science")
	public void addScienceBook(@RequestBody ScienceBook Sbook) {
		booksService3.addScienceBook(Sbook);
		
		
	}
	
	@RequestMapping("/books/Science/{id}")
	public ScienceBook getScienceBook(@PathVariable String id)
	{
		return (ScienceBook) booksService3.getScienceBook(id);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/books/Science/{id}")
	public void updateScienceBook(@RequestBody ScienceBook Sbook, @PathVariable String id) {
	booksService3.updateScienceBook(id, Sbook);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/books/Science/{id}")
	public void deleteScienceBook(@RequestBody ScienceBook Sbook, @PathVariable String id) {
		booksService3.deleteScienceBook(id);
	}
	
	@RequestMapping("/books/Maths")
	public List<MathBook> getAllMathBooks()
	{
		return booksService4.getAllMathBooks();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/books/Maths")
	public void addMathBook(@RequestBody MathBook Mbook) {
		booksService4.addMathBook(Mbook);
		
		
	}
	
	@RequestMapping("/books/Maths/{id}")
	public MathBook getMathBook(@PathVariable String id)
	{
		return (MathBook) booksService4.getMathBook(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/books/Maths/{id}")
	public void updateMathBook(@RequestBody MathBook Mbook, @PathVariable String id) {
		booksService4.updateMathBook(id, Mbook);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/books/Maths/{id}")
	public void deleteMathBook(@RequestBody MathBook Mbook, @PathVariable String id) {
		booksService4.deleteMathBook(id);
	}
	
}
