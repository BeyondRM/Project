package brm.projects.utility.throwables;
import java.io.File;

/**
 *
 * @author Gregory
 */
public final class ExceptionOrmFileDoesNotExist extends ExceptionOrm {
  private static final long serialVersionUID = 1L;

  public ExceptionOrmFileDoesNotExist(File f) {
    super(f, (byte)0, (byte)0);
  }
}
