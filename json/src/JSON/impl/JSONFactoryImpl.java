/**
 */
package JSON.impl;

import JSON.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JSONFactoryImpl extends EFactoryImpl implements JSONFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JSONFactory init() {
		try {
			JSONFactory theJSONFactory = (JSONFactory)EPackage.Registry.INSTANCE.getEFactory(JSONPackage.eNS_URI);
			if (theJSONFactory != null) {
				return theJSONFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JSONFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JSONPackage.JSON: return createJSON();
			case JSONPackage.JSON_ELEMENT: return createJSONElement();
			case JSONPackage.JSON_OBJECT: return createJSONObject();
			case JSONPackage.JSON_ARRAY: return createJSONArray();
			case JSONPackage.JSON_VALUE: return createJSONValue();
			case JSONPackage.JSON_PROPERTY: return createJSONProperty();
			case JSONPackage.JSON_BOOLEAN: return createJSONBoolean();
			case JSONPackage.JSON_STRING: return createJSONString();
			case JSONPackage.JSON_NULL: return createJSONNull();
			case JSONPackage.JSON_NUMBER: return createJSONNumber();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSON createJSON() {
		JSONImpl json = new JSONImpl();
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONElement createJSONElement() {
		JSONElementImpl jsonElement = new JSONElementImpl();
		return jsonElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObject() {
		JSONObjectImpl jsonObject = new JSONObjectImpl();
		return jsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONArray createJSONArray() {
		JSONArrayImpl jsonArray = new JSONArrayImpl();
		return jsonArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONValue createJSONValue() {
		JSONValueImpl jsonValue = new JSONValueImpl();
		return jsonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONProperty createJSONProperty() {
		JSONPropertyImpl jsonProperty = new JSONPropertyImpl();
		return jsonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONBoolean createJSONBoolean() {
		JSONBooleanImpl jsonBoolean = new JSONBooleanImpl();
		return jsonBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONString createJSONString() {
		JSONStringImpl jsonString = new JSONStringImpl();
		return jsonString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONNull createJSONNull() {
		JSONNullImpl jsonNull = new JSONNullImpl();
		return jsonNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONNumber createJSONNumber() {
		JSONNumberImpl jsonNumber = new JSONNumberImpl();
		return jsonNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONPackage getJSONPackage() {
		return (JSONPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JSONPackage getPackage() {
		return JSONPackage.eINSTANCE;
	}

} //JSONFactoryImpl
