/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Shape#getWidth <em>Width</em>}</li>
 *   <li>{@link DOT.Shape#getHeight <em>Height</em>}</li>
 *   <li>{@link DOT.Shape#getPeripheries <em>Peripheries</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see DOT.DOTPackage#getShape_Width()
	 * @model
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link DOT.Shape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see DOT.DOTPackage#getShape_Height()
	 * @model
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link DOT.Shape#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheries</em>' attribute.
	 * @see #setPeripheries(Integer)
	 * @see DOT.DOTPackage#getShape_Peripheries()
	 * @model
	 * @generated
	 */
	Integer getPeripheries();

	/**
	 * Sets the value of the '{@link DOT.Shape#getPeripheries <em>Peripheries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheries</em>' attribute.
	 * @see #getPeripheries()
	 * @generated
	 */
	void setPeripheries(Integer value);

} // Shape
