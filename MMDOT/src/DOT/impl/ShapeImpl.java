/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Shape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.ShapeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link DOT.impl.ShapeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link DOT.impl.ShapeImpl#getPeripheries <em>Peripheries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeImpl extends GraphElementImpl implements Shape {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeripheries() <em>Peripheries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheries()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERIPHERIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeripheries() <em>Peripheries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheries()
	 * @generated
	 * @ordered
	 */
	protected Integer peripheries = PERIPHERIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.SHAPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Integer newHeight) {
		Integer oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.SHAPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPeripheries() {
		return peripheries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeripheries(Integer newPeripheries) {
		Integer oldPeripheries = peripheries;
		peripheries = newPeripheries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.SHAPE__PERIPHERIES, oldPeripheries, peripheries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.SHAPE__WIDTH:
				return getWidth();
			case DOTPackage.SHAPE__HEIGHT:
				return getHeight();
			case DOTPackage.SHAPE__PERIPHERIES:
				return getPeripheries();
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
			case DOTPackage.SHAPE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case DOTPackage.SHAPE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case DOTPackage.SHAPE__PERIPHERIES:
				setPeripheries((Integer)newValue);
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
			case DOTPackage.SHAPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DOTPackage.SHAPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DOTPackage.SHAPE__PERIPHERIES:
				setPeripheries(PERIPHERIES_EDEFAULT);
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
			case DOTPackage.SHAPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case DOTPackage.SHAPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case DOTPackage.SHAPE__PERIPHERIES:
				return PERIPHERIES_EDEFAULT == null ? peripheries != null : !PERIPHERIES_EDEFAULT.equals(peripheries);
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", peripheries: ");
		result.append(peripheries);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
