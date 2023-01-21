/**
 */
package DOT.impl;

import DOT.Arc;
import DOT.DOTPackage;
import DOT.NodeLike;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.ArcImpl#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getFromNode <em>From Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends GraphElementImpl implements Arc {
	/**
	 * The default value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected boolean constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected NodeLike toNode;

	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected NodeLike fromNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(boolean newConstraint) {
		boolean oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLike getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (NodeLike)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLike basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToNode(NodeLike newToNode, NotificationChain msgs) {
		NodeLike oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__TO_NODE, oldToNode, newToNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNode(NodeLike newToNode) {
		if (newToNode != toNode) {
			NotificationChain msgs = null;
			if (toNode != null)
				msgs = ((InternalEObject)toNode).eInverseRemove(this, DOTPackage.NODE_LIKE__REFERRED_BY, NodeLike.class, msgs);
			if (newToNode != null)
				msgs = ((InternalEObject)newToNode).eInverseAdd(this, DOTPackage.NODE_LIKE__REFERRED_BY, NodeLike.class, msgs);
			msgs = basicSetToNode(newToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__TO_NODE, newToNode, newToNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLike getFromNode() {
		if (fromNode != null && fromNode.eIsProxy()) {
			InternalEObject oldFromNode = (InternalEObject)fromNode;
			fromNode = (NodeLike)eResolveProxy(oldFromNode);
			if (fromNode != oldFromNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__FROM_NODE, oldFromNode, fromNode));
			}
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLike basicGetFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromNode(NodeLike newFromNode, NotificationChain msgs) {
		NodeLike oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__FROM_NODE, oldFromNode, newFromNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromNode(NodeLike newFromNode) {
		if (newFromNode != fromNode) {
			NotificationChain msgs = null;
			if (fromNode != null)
				msgs = ((InternalEObject)fromNode).eInverseRemove(this, DOTPackage.NODE_LIKE__REFERS, NodeLike.class, msgs);
			if (newFromNode != null)
				msgs = ((InternalEObject)newFromNode).eInverseAdd(this, DOTPackage.NODE_LIKE__REFERS, NodeLike.class, msgs);
			msgs = basicSetFromNode(newFromNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__FROM_NODE, newFromNode, newFromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.ARC__TO_NODE:
				if (toNode != null)
					msgs = ((InternalEObject)toNode).eInverseRemove(this, DOTPackage.NODE_LIKE__REFERRED_BY, NodeLike.class, msgs);
				return basicSetToNode((NodeLike)otherEnd, msgs);
			case DOTPackage.ARC__FROM_NODE:
				if (fromNode != null)
					msgs = ((InternalEObject)fromNode).eInverseRemove(this, DOTPackage.NODE_LIKE__REFERS, NodeLike.class, msgs);
				return basicSetFromNode((NodeLike)otherEnd, msgs);
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
			case DOTPackage.ARC__TO_NODE:
				return basicSetToNode(null, msgs);
			case DOTPackage.ARC__FROM_NODE:
				return basicSetFromNode(null, msgs);
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
			case DOTPackage.ARC__CONSTRAINT:
				return isConstraint();
			case DOTPackage.ARC__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
			case DOTPackage.ARC__FROM_NODE:
				if (resolve) return getFromNode();
				return basicGetFromNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DOTPackage.ARC__CONSTRAINT:
				setConstraint((Boolean)newValue);
				return;
			case DOTPackage.ARC__TO_NODE:
				setToNode((NodeLike)newValue);
				return;
			case DOTPackage.ARC__FROM_NODE:
				setFromNode((NodeLike)newValue);
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
			case DOTPackage.ARC__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case DOTPackage.ARC__TO_NODE:
				setToNode((NodeLike)null);
				return;
			case DOTPackage.ARC__FROM_NODE:
				setFromNode((NodeLike)null);
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
			case DOTPackage.ARC__CONSTRAINT:
				return constraint != CONSTRAINT_EDEFAULT;
			case DOTPackage.ARC__TO_NODE:
				return toNode != null;
			case DOTPackage.ARC__FROM_NODE:
				return fromNode != null;
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
