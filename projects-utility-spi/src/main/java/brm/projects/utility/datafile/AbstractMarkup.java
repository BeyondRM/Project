package brm.projects.utility.datafile;
import org.w3c.dom.Node;


/**
 * An abstract markup file. This class represents a root node which can be parsed.
 * @author Gregory
 */
abstract public class AbstractMarkup {
  /**
   * A public constructor. This takes in a root markup node and parses the relevant portions of the data files into the
   * relevant class fields.
   * @param n A {@link Node} object, representing the markup data.
   * @see AbstractMarkup
   */
  public AbstractMarkup(Node n) {
  }

  /**
   * As a Node. This method is meant to return the class fields as a saveable markup node.
   * @return A {@link Node} object.
   * @see AbstractMarkup
   */
  abstract public Node asNode();
}
