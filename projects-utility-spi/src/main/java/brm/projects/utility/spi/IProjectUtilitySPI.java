package brm.projects.utility.spi;
import brm.projects.utility.ProjectBuilder;
import brm.projects.utility.ProjectIdentity;


/**
 * The project SPI. This interface is used to define the project operational methods; it allows defining details of the
 * project being opened, saved, built, and closed or quit.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public interface IProjectUtilitySPI {
  public ProjectBuilder getProjectBuilder();

  public ProjectIdentity getProjectIdentity();

  public boolean isProjectOpen();

  public void onProjectExit();

  public void onProjectOpen();

  public void onProjectSave();

  public void onProjectSaveAs();
}
