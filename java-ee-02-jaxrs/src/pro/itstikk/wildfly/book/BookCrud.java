package pro.itstikk.wildfly.book;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpa.model.Book;
@Path("/book")
public interface BookCrud {
	@Path("/save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Book book);
	@Path("/list")
	@GET @Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBooks();
	@Path("/get/{sid}")
	@GET @Produces(MediaType.APPLICATION_JSON)
	public Book getBook(String sid);
}
