package brm.projects.utility.throwables;
import java.io.File;


/**
 * An exception for ORM project data-handling. Subclasses of this object are typically thrown where file-IO exceptions,
 * or thrown instances of any kind, are caught while trying to read and parse the various Open RPG Maker project files.
 * <h1>Why Important.</h1>
 * Having special exception classes are important so that any caught instances can be "properly" re-thrown as a wrapped
 * instance, containing the file information, the point of failure, and the final resolution (if it could be discerned)
 * for the import instance.
 * @author Gregory
 */
abstract public class ExceptionOrm extends Exception {
  private static final long serialVersionUID = 1L;

  /**
   * The source file. This is the object which caused a problem in the reading or parsing; it's referenced here because
   * the catching class may want to notify the user as the data is being read or processed of the potential problem and
   * resolution, with a chance to handle the error manually.
   * @see ExceptionOrm
   */
  public final File file;
  /**
   * The problem code. This holds the value of exactly what aspect of the reading or parsing was the encountered error.
   * This is used to declare to the user what type of problem they should look for, when attempting to repair the data.
   * @see ExceptionOrm
   */
  public final byte code;
  /**
   * The done status. This represents a declarative result of the import resolution, such as whether an attempt to read
   * or parse the file object was aborted, or whether enough information was available to continue, or various other in
   * between states.
   * @see ExceptionOrm
   */
  public final byte done;

  /**
   * A public constructor. This instantiates a new {@link ExceptionOrm} object with set field values for local fields.
   * @param f A {@link File} object, representing the source {@link #file file}.
   * @param b A {@link Byte} value, representing the problem {@link #code code} state.
   * @param c A {@link Byte} value, representing the problem {@link #done done} state.
   * @see ErrorOrmProject
   */
  public ExceptionOrm(File f, byte b, byte c) {
    file = f;
    code = b;
    done = c;
  }
}
