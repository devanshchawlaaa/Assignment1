package Demo_1tomany;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Question")
public class Question {
	private int id;
	private String qnmae;
	
}
