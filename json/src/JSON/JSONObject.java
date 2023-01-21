/**
 */
package JSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JSON.JSONObject#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see JSON.JSONPackage#getJSONObject()
 * @model
 * @generated
 */
public interface JSONObject extends JSONElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link JSON.JSONProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see JSON.JSONPackage#getJSONObject_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<JSONProperty> getProperties();

} // JSONObject
