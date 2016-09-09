package brm.projects.versioning.archetypes;
import java.io.File;
import java.net.URL;


/**
 * The archetypal version interface. This defines the methods which must be implemented in classes, to provide relative
 * version-control operations.
 * @author Gregory
 */
abstract public class ArchetypeVersion {
  private final URL url;
  /**
   * @see ArchetypeVersion
   */
  private File file = null;
  // any additional fields responsible for storing the user identity or handling required permission levels....

  ArchetypeVersion() {
    url = null;
  }

  /**
   * A default constructor.
   * @param u
   * @see ArchetypeVersion
   */
  ArchetypeVersion(URL u) {
  //url = new URL("protocol", "host", 0, "file");
    url = u;
  }

  public final URL getUrl() {
    return url;
  }

  /**
   * Create location.
   * @param f A {@link File} object, representing the location to be created.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean createLocation(File f);

  /**
   * If has access. This obtains whether the current user has a given access-rights permission to the remote repository
   * (used for determining read or write permission).
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean hasAccess();

  /**
   * If current.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean isCurrent();

  /**
   * Is repository readable. This obtains whether the remote repository is readable with the current user's credentials
   * (sometimes stored elsewhere in the computer). Thrown exceptions should be processed within the method.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean isRepositoryReadable();

  /**
   * Is repository writable. This obtains whether the remote repository is writable with the current user's credentials
   * (sometimes stored elsewhere in the computer). Thrown exceptions should be processed within the method.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean isRepositoryWritable();

  /**
   * Pull changes.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean updatePull();

  /**
   * Push changes.
   * @return A {@link Boolean} condition.
   * @see ArchetypeVersion
   */
  abstract public boolean updatePush();
}
