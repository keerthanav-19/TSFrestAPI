package com.sparks.springbootstarter.bookLibrary.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

	
	@Autowired
	private HistoryBookRepository booksRepository1;
	@Autowired
	private BiographyBookRepository booksRepository2;
	@Autowired
	private ScienceBookRepository booksRepository3;
	@Autowired
	private MathBookRepository booksRepository4;
	
	public List<HistoryBook> getAllHistoryBooks(){
		List<HistoryBook> Historybooks=new ArrayList<>();
		booksRepository1.findAll()
		.forEach(Historybooks::add);
		return Historybooks;
	}
	
	public HistoryBook getHistoryBook(String id)
	{
		
		HistoryBook h=booksRepository1.findById(id).get();
		return h;
	}
	
	public void addHistoryBook(HistoryBook Hbook) {
		booksRepository1.save(Hbook);
	}

	
	public void updateHistoryBook(String id, HistoryBook Hbook) {
		
			booksRepository1.save(Hbook);
		
	}
	
	public void deleteHistoryBook(String id) {
		
		booksRepository1.deleteById(id);
		
		}
    
	public List<BiographyBook> getAllBiographyBooks(){
		List<BiographyBook> Biographybooks=new ArrayList<>();
		booksRepository2.findAll()
		.forEach(Biographybooks::add);
		return Biographybooks;
	}
	
	
	public void addBiographyBook(BiographyBook Bbook) {
		// TODO Auto-generated method stub
		booksRepository2.save(Bbook);
	}

	
	public BiographyBook getBiographyBook(String id)
	{
		
		BiographyBook b=booksRepository2.findById(id).get();
		return b;
	}
	
	public void updateBiographyBook(String id, BiographyBook Bbook) {
		
		booksRepository2.save(Bbook);
	
}
public void deleteBiographyBook(String id) {
		
		booksRepository2.deleteById(id);
		
		}
    

public List<ScienceBook> getAllScienceBooks(){
	List<ScienceBook> Sciencebooks=new ArrayList<>();
	booksRepository3.findAll()
	.forEach(Sciencebooks::add);
	return Sciencebooks;
}


public void addScienceBook(ScienceBook Sbook) {
	// TODO Auto-generated method stub
	booksRepository3.save(Sbook);
}


public ScienceBook getScienceBook(String id)
{
	
	ScienceBook s=booksRepository3.findById(id).get();
	return s;
}

public void updateScienceBook(String id, ScienceBook Sbook) {
	
	booksRepository3.save(Sbook);

}
public void deleteScienceBook(String id) {
	
	booksRepository3.deleteById(id);
	
	}

public List<MathBook> getAllMathBooks(){
	List<MathBook> Mathbooks=new ArrayList<>();
	booksRepository4.findAll()
	.forEach(Mathbooks::add);
	return Mathbooks;
}

public void addMathBook(MathBook Mbook) {
	// TODO Auto-generated method stub
	booksRepository4.save(Mbook);
}

public MathBook getMathBook(String id)
{
	
	MathBook m=booksRepository4.findById(id).get();
	return m;
}

public void updateMathBook(String id, MathBook Mbook) {
	
	booksRepository4.save(Mbook);

}

public void deleteMathBook(String id) {
	
	booksRepository4.deleteById(id);
	
	}

	
}
