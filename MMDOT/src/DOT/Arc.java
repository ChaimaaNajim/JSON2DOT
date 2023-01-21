/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Arc#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link DOT.Arc#getToNode <em>To Node</em>}</li>
 *   <li>{@link DOT.Arc#getFromNode <em>From Node</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(boolean)
	 * @see DOT.DOTPackage#getArc_Constraint()
	 * @model
	 * @generated
	 */
	boolean isConstraint();

	/**
	 * Sets the value of the '{@link DOT.Arc#isConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #isConstraint()
	 * @generated
	 */
	void setConstraint(boolean value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DOT.NodeLike#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(NodeLike)
	 * @see DOT.DOTPackage#getArc_ToNode()
	 * @see DOT.NodeLike#getReferredBy
	 * @model opposite="referredBy" required="true"
	 * @generated
	 */
	NodeLike getToNode();

	/**
	 * Sets the value of the '{@link DOT.Arc#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(NodeLike value);

	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DOT.NodeLike#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference.
	 * @see #setFromNode(NodeLike)
	 * @see DOT.DOTPackage#getArc_FromNode()
	 * @see DOT.NodeLike#getRefers
	 * @model opposite="refers" required="true"
	 * @generated
	 */
	NodeLike getFromNode();

	/**
	 * Sets the value of the '{@link DOT.Arc#getFromNode <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' reference.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(NodeLike value);

} // Arc
