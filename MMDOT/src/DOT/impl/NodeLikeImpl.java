/**
 */
package DOT.impl;

import DOT.Arc;
import DOT.DOTPackage;
import DOT.Graph;
import DOT.NodeLike;
import DOT.SubGraph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Like</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.NodeLikeImpl#getRefers <em>Refers</em>}</li>
 *   <li>{@link DOT.impl.NodeLikeImpl#getReferredBy <em>Referred By</em>}</li>
 *   <li>{@link DOT.impl.NodeLikeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link DOT.impl.NodeLikeImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeLikeImpl extends GraphElementImpl implements NodeLike {
	/**
	 * The cached value of the '{@link #getRefers() <em>Refers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefers()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> refers;

	/**
	 * The cached value of the '{@link #getReferredBy() <em>Referred By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> referredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeLikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.NODE_LIKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getRefers() {
		if (refers == null) {
			refers = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, DOTPackage.NODE_LIKE__REFERS, DOTPackage.ARC__FROM_NODE);
		}
		return refers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getReferredBy() {
		if (referredBy == null) {
			referredBy = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, DOTPackage.NODE_LIKE__REFERRED_BY, DOTPackage.ARC__TO_NODE);
		}
		return referredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGraph getOwner() {
		if (eContainerFeatureID() != DOTPackage.NODE_LIKE__OWNER) return null;
		return (SubGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(SubGraph newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, DOTPackage.NODE_LIKE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(SubGraph newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != DOTPackage.NODE_LIKE__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, DOTPackage.SUB_GRAPH__NODES, SubGraph.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE_LIKE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (eContainerFeatureID() != DOTPackage.NODE_LIKE__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraph, DOTPackage.NODE_LIKE__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != DOTPackage.NODE_LIKE__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, DOTPackage.GRAPH__NODES, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE_LIKE__GRAPH, newGraph, newGraph));
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
			case DOTPackage.NODE_LIKE__REFERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefers()).basicAdd(otherEnd, msgs);
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredBy()).basicAdd(otherEnd, msgs);
			case DOTPackage.NODE_LIKE__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((SubGraph)otherEnd, msgs);
			case DOTPackage.NODE_LIKE__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
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
			case DOTPackage.NODE_LIKE__REFERS:
				return ((InternalEList<?>)getRefers()).basicRemove(otherEnd, msgs);
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				return ((InternalEList<?>)getReferredBy()).basicRemove(otherEnd, msgs);
			case DOTPackage.NODE_LIKE__OWNER:
				return basicSetOwner(null, msgs);
			case DOTPackage.NODE_LIKE__GRAPH:
				return basicSetGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DOTPackage.NODE_LIKE__OWNER:
				return eInternalContainer().eInverseRemove(this, DOTPackage.SUB_GRAPH__NODES, SubGraph.class, msgs);
			case DOTPackage.NODE_LIKE__GRAPH:
				return eInternalContainer().eInverseRemove(this, DOTPackage.GRAPH__NODES, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.NODE_LIKE__REFERS:
				return getRefers();
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				return getReferredBy();
			case DOTPackage.NODE_LIKE__OWNER:
				return getOwner();
			case DOTPackage.NODE_LIKE__GRAPH:
				return getGraph();
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
			case DOTPackage.NODE_LIKE__REFERS:
				getRefers().clear();
				getRefers().addAll((Collection<? extends Arc>)newValue);
				return;
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				getReferredBy().clear();
				getReferredBy().addAll((Collection<? extends Arc>)newValue);
				return;
			case DOTPackage.NODE_LIKE__OWNER:
				setOwner((SubGraph)newValue);
				return;
			case DOTPackage.NODE_LIKE__GRAPH:
				setGraph((Graph)newValue);
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
			case DOTPackage.NODE_LIKE__REFERS:
				getRefers().clear();
				return;
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				getReferredBy().clear();
				return;
			case DOTPackage.NODE_LIKE__OWNER:
				setOwner((SubGraph)null);
				return;
			case DOTPackage.NODE_LIKE__GRAPH:
				setGraph((Graph)null);
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
			case DOTPackage.NODE_LIKE__REFERS:
				return refers != null && !refers.isEmpty();
			case DOTPackage.NODE_LIKE__REFERRED_BY:
				return referredBy != null && !referredBy.isEmpty();
			case DOTPackage.NODE_LIKE__OWNER:
				return getOwner() != null;
			case DOTPackage.NODE_LIKE__GRAPH:
				return getGraph() != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeLikeImpl
