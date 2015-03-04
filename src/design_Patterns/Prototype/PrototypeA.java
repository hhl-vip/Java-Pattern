package design_Patterns.Prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 浅复制与深复制
 * @author Tomcatx
 *
 */
public class PrototypeA implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObject so;
	
	/**
	 * 浅复制
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object cloneA() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/**
	 * 深复制
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	 public Object deepClone() throws IOException, ClassNotFoundException{
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(bos);
		 oos.writeObject(this);
		 
		 ByteArrayInputStream bais = new ByteArrayInputStream(bos.toByteArray());
		 ObjectInputStream  ois = new ObjectInputStream(bais);
		 return ois.readObject();
		 
	 }
	
}
class SerializableObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
}
