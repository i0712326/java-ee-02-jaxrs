package pro.itstikk.wildfly.book;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.ejb.crud.BookEjb;
import com.jpa.model.Book;
@Named
@RequestScoped
public class BookCrudImp implements BookCrud {
	@EJB
	private BookEjb bookEjb;
	@Override
	public void save(Book book) {
		bookEjb.save(book);
	}

	@Override
	public List<Book> getBooks() {
		return bookEjb.getBooks();
	}

	@Override
	public Book getBook(String sid) {
		return bookEjb.getBook(sid);
	}

}
