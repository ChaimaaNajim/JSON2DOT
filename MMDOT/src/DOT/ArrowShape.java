/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.ArrowShape#getClipping <em>Clipping</em>}</li>
 *   <li>{@link DOT.ArrowShape#isIsPlane <em>Is Plane</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getArrowShape()
 * @model
 * @generated
 */
public interface ArrowShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Clipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clipping</em>' attribute.
	 * @see #setClipping(String)
	 * @see DOT.DOTPackage#getArrowShape_Clipping()
	 * @model
	 * @generated
	 */
	String getClipping();

	/**
	 * Sets the value of the '{@link DOT.ArrowShape#getClipping <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clipping</em>' attribute.
	 * @see #getClipping()
	 * @generated
	 */
	void setClipping(String value);

	/**
	 * Returns the value of the '<em><b>Is Plane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Plane</em>' attribute.
	 * @see #setIsPlane(boolean)
	 * @see DOT.DOTPackage#getArrowShape_IsPlane()
	 * @model
	 * @generated
	 */
	boolean isIsPlane();

	/**
	 * Sets the value of the '{@link DOT.ArrowShape#isIsPlane <em>Is Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Plane</em>' attribute.
	 * @see #isIsPlane()
	 * @generated
	 */
	void setIsPlane(boolean value);

} // ArrowShape
