/**
 */
package DOT.impl;

import DOT.ArrowShape;
import DOT.DOTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.ArrowShapeImpl#getClipping <em>Clipping</em>}</li>
 *   <li>{@link DOT.impl.ArrowShapeImpl#isIsPlane <em>Is Plane</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowShapeImpl extends ShapeImpl implements ArrowShape {
	/**
	 * The default value of the '{@link #getClipping() <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipping()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClipping() <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipping()
	 * @generated
	 * @ordered
	 */
	protected String clipping = CLIPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlane() <em>Is Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlane()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlane() <em>Is Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlane()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlane = IS_PLANE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.ARROW_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipping() {
		return clipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipping(String newClipping) {
		String oldClipping = clipping;
		clipping = newClipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARROW_SHAPE__CLIPPING, oldClipping, clipping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlane() {
		return isPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlane(boolean newIsPlane) {
		boolean oldIsPlane = isPlane;
		isPlane = newIsPlane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARROW_SHAPE__IS_PLANE, oldIsPlane, isPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				return getClipping();
			case DOTPackage.ARROW_SHAPE__IS_PLANE:
				return isIsPlane();
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				setClipping((String)newValue);
				return;
			case DOTPackage.ARROW_SHAPE__IS_PLANE:
				setIsPlane((Boolean)newValue);
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				setClipping(CLIPPING_EDEFAULT);
				return;
			case DOTPackage.ARROW_SHAPE__IS_PLANE:
				setIsPlane(IS_PLANE_EDEFAULT);
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				return CLIPPING_EDEFAULT == null ? clipping != null : !CLIPPING_EDEFAULT.equals(clipping);
			case DOTPackage.ARROW_SHAPE__IS_PLANE:
				return isPlane != IS_PLANE_EDEFAULT;
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
		result.append(" (clipping: ");
		result.append(clipping);
		result.append(", isPlane: ");
		result.append(isPlane);
		result.append(')');
		return result.toString();
	}

} //ArrowShapeImpl
