package brm.projects.versioning.archetypes;
import java.io.File;


/**
 * The archetypal version interface. This defines the methods which must be implemented in classes, to provide relative
 * version-control operations.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public interface IArchetypeVersion {
  /**
   * @see IArchetypeVersion
   */
  File file = null;

  /**
   * Create location.
   * @param f A {@link File} object, representing the location to be created.
   * @return A {@link Boolean} condition.
   * @see IArchetypeVersion
   */
  public boolean createLocation(File f);

  /**
   * If current.
   * @return A {@link Boolean} condition.
   * @see IArchetypeVersion
   */
  public boolean isCurrent();

  /**
   * Pull changes.
   * @return A {@link Boolean} condition.
   * @see IArchetypeVersion
   */
  public boolean updatePull();

  /**
   * Push changes.
   * @return A {@link Boolean} condition.
   * @see IArchetypeVersion
   */
  public boolean updatePush();
}
