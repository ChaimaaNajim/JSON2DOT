/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Graph#getType <em>Type</em>}</li>
 *   <li>{@link DOT.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.Graph#getRankDir <em>Rank Dir</em>}</li>
 *   <li>{@link DOT.Graph#getLabelloc <em>Labelloc</em>}</li>
 *   <li>{@link DOT.Graph#getLabeljust <em>Labeljust</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see DOT.DOTPackage#getGraph_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link DOT.Graph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.NodeLike}.
	 * It is bidirectional and its opposite is '{@link DOT.NodeLike#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see DOT.DOTPackage#getGraph_Nodes()
	 * @see DOT.NodeLike#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<NodeLike> getNodes();

	/**
	 * Returns the value of the '<em><b>Rank Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank Dir</em>' attribute.
	 * @see #setRankDir(String)
	 * @see DOT.DOTPackage#getGraph_RankDir()
	 * @model
	 * @generated
	 */
	String getRankDir();

	/**
	 * Sets the value of the '{@link DOT.Graph#getRankDir <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank Dir</em>' attribute.
	 * @see #getRankDir()
	 * @generated
	 */
	void setRankDir(String value);

	/**
	 * Returns the value of the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelloc</em>' attribute.
	 * @see #setLabelloc(String)
	 * @see DOT.DOTPackage#getGraph_Labelloc()
	 * @model
	 * @generated
	 */
	String getLabelloc();

	/**
	 * Sets the value of the '{@link DOT.Graph#getLabelloc <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelloc</em>' attribute.
	 * @see #getLabelloc()
	 * @generated
	 */
	void setLabelloc(String value);

	/**
	 * Returns the value of the '<em><b>Labeljust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeljust</em>' attribute.
	 * @see #setLabeljust(String)
	 * @see DOT.DOTPackage#getGraph_Labeljust()
	 * @model
	 * @generated
	 */
	String getLabeljust();

	/**
	 * Sets the value of the '{@link DOT.Graph#getLabeljust <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeljust</em>' attribute.
	 * @see #getLabeljust()
	 * @generated
	 */
	void setLabeljust(String value);

} // Graph
