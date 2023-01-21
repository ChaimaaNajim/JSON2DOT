/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Graph;
import DOT.NodeLike;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.GraphImpl#getType <em>Type</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getRankDir <em>Rank Dir</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getLabelloc <em>Labelloc</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getLabeljust <em>Labeljust</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends GraphElementImpl implements Graph {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeLike> nodes;

	/**
	 * The default value of the '{@link #getRankDir() <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankDir()
	 * @generated
	 * @ordered
	 */
	protected static final String RANK_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRankDir() <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankDir()
	 * @generated
	 * @ordered
	 */
	protected String rankDir = RANK_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelloc() <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelloc()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELLOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelloc() <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelloc()
	 * @generated
	 * @ordered
	 */
	protected String labelloc = LABELLOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabeljust() <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeljust()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELJUST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabeljust() <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeljust()
	 * @generated
	 * @ordered
	 */
	protected String labeljust = LABELJUST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeLike> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<NodeLike>(NodeLike.class, this, DOTPackage.GRAPH__NODES, DOTPackage.NODE_LIKE__GRAPH);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRankDir() {
		return rankDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankDir(String newRankDir) {
		String oldRankDir = rankDir;
		rankDir = newRankDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__RANK_DIR, oldRankDir, rankDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelloc() {
		return labelloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelloc(String newLabelloc) {
		String oldLabelloc = labelloc;
		labelloc = newLabelloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__LABELLOC, oldLabelloc, labelloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabeljust() {
		return labeljust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabeljust(String newLabeljust) {
		String oldLabeljust = labeljust;
		labeljust = newLabeljust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__LABELJUST, oldLabeljust, labeljust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.GRAPH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.GRAPH__TYPE:
				return getType();
			case DOTPackage.GRAPH__NODES:
				return getNodes();
			case DOTPackage.GRAPH__RANK_DIR:
				return getRankDir();
			case DOTPackage.GRAPH__LABELLOC:
				return getLabelloc();
			case DOTPackage.GRAPH__LABELJUST:
				return getLabeljust();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DOTPackage.GRAPH__TYPE:
				setType((String)newValue);
				return;
			case DOTPackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeLike>)newValue);
				return;
			case DOTPackage.GRAPH__RANK_DIR:
				setRankDir((String)newValue);
				return;
			case DOTPackage.GRAPH__LABELLOC:
				setLabelloc((String)newValue);
				return;
			case DOTPackage.GRAPH__LABELJUST:
				setLabeljust((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DOTPackage.GRAPH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DOTPackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case DOTPackage.GRAPH__RANK_DIR:
				setRankDir(RANK_DIR_EDEFAULT);
				return;
			case DOTPackage.GRAPH__LABELLOC:
				setLabelloc(LABELLOC_EDEFAULT);
				return;
			case DOTPackage.GRAPH__LABELJUST:
				setLabeljust(LABELJUST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DOTPackage.GRAPH__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DOTPackage.GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case DOTPackage.GRAPH__RANK_DIR:
				return RANK_DIR_EDEFAULT == null ? rankDir != null : !RANK_DIR_EDEFAULT.equals(rankDir);
			case DOTPackage.GRAPH__LABELLOC:
				return LABELLOC_EDEFAULT == null ? labelloc != null : !LABELLOC_EDEFAULT.equals(labelloc);
			case DOTPackage.GRAPH__LABELJUST:
				return LABELJUST_EDEFAULT == null ? labeljust != null : !LABELJUST_EDEFAULT.equals(labeljust);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", rankDir: ");
		result.append(rankDir);
		result.append(", labelloc: ");
		result.append(labelloc);
		result.append(", labeljust: ");
		result.append(labeljust);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
