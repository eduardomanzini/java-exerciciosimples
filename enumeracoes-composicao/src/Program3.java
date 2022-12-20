import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("How that's awesome");
		Post p1 = new Post (
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to new Zeland", 
				"I'm going to visiti this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post (
				sdf.parse("28/07/2018 23:05:44"), 
				"Good night guys", 
				"Se you tomorrow!",
				5);
		
		p1.addComment(c3);
		p1.addComment(c4);
		
		
		System.out.println(p1);
		
		
		
		
		
		
		
	}

}
