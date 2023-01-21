/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.SubGraph#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getSubGraph()
 * @model
 * @generated
 */
public interface SubGraph extends NodeLike {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.NodeLike}.
	 * It is bidirectional and its opposite is '{@link DOT.NodeLike#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see DOT.DOTPackage#getSubGraph_Nodes()
	 * @see DOT.NodeLike#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<NodeLike> getNodes();

} // SubGraph
