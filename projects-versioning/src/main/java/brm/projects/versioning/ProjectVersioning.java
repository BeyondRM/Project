package brm.projects.versioning;


/**
 * The project versioning. This class allows managing the details of a project's being versioned under a source-control
 * methodology. The version-control could take the form of simply archiving a project into a compressed file, or it may
 * depend on a known form of version-control software, resulting in a repository of files and resources.
 * <p>
 * At the core of it, we start with an interface which defines several of the version-control activities which might be
 * required: initialize a repository, push or pull changes, list changed files, et cetera. This singleton class object,
 * as the managing node, should implement the same interface, and iterate through a list of concurrent version-controls
 * to perform the specified actions.
 * @author Gregory
 * @see #instance instance
 * @see #ProjectVersioning() ProjectVersioning()
 */
public final class ProjectVersioning {
  /**
   * The default {@link ProjectVersioning} instance.
   * @see #ProjectVersioning
   */
  public static final ProjectVersioning instance;

  static {
    instance = new ProjectVersioning();
  }

  private ProjectVersioning() {
  }
}
