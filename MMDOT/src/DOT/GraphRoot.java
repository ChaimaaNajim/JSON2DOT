/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.GraphRoot#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getGraphRoot()
 * @model
 * @generated
 */
public interface GraphRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see DOT.DOTPackage#getGraphRoot_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphElement> getElements();

} // GraphRoot
