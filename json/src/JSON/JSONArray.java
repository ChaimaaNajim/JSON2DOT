/**
 */
package JSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JSON.JSONArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see JSON.JSONPackage#getJSONArray()
 * @model
 * @generated
 */
public interface JSONArray extends JSONElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link JSON.JSONElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see JSON.JSONPackage#getJSONArray_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<JSONElement> getElements();

} // JSONArray
