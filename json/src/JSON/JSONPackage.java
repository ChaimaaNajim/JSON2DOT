/**
 */
package JSON;
import JSON.impl.*;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JSON.JSONFactory
 * @model kind="package"
 * @generated
 */
public interface JSONPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "JSON";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ensias.ma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "JSON";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JSONPackage eINSTANCE = JSONPackageImpl.init();

	/**
	 * The meta object id for the '{@link JSON.impl.JSONImpl <em>JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONImpl
	 * @see JSON.impl.JSONPackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__NAME = 1;

	/**
	 * The number of structural features of the '<em>JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONElementImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONElement()
	 * @generated
	 */
	int JSON_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONObjectImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__PROPERTIES = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONArrayImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONArray()
	 * @generated
	 */
	int JSON_ARRAY = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY__ELEMENTS = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONValueImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONValue()
	 * @generated
	 */
	int JSON_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_FEATURE_COUNT = JSON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_OPERATION_COUNT = JSON_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONPropertyImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONProperty()
	 * @generated
	 */
	int JSON_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONBooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONBooleanImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONBoolean()
	 * @generated
	 */
	int JSON_BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN__VALUE = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONStringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONStringImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONString()
	 * @generated
	 */
	int JSON_STRING = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING__VALUE = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_STRING_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONNullImpl <em>Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONNullImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONNull()
	 * @generated
	 */
	int JSON_NULL = 8;

	/**
	 * The number of structural features of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NULL_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NULL_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JSON.impl.JSONNumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JSON.impl.JSONNumberImpl
	 * @see JSON.impl.JSONPackageImpl#getJSONNumber()
	 * @generated
	 */
	int JSON_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NUMBER__VALUE = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NUMBER_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NUMBER_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link JSON.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON</em>'.
	 * @see JSON.JSON
	 * @generated
	 */
	EClass getJSON();

	/**
	 * Returns the meta object for the containment reference list '{@link JSON.JSON#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see JSON.JSON#getElements()
	 * @see #getJSON()
	 * @generated
	 */
	EReference getJSON_Elements();

	/**
	 * Returns the meta object for the attribute '{@link JSON.JSON#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see JSON.JSON#getName()
	 * @see #getJSON()
	 * @generated
	 */
	EAttribute getJSON_Name();

	/**
	 * Returns the meta object for class '{@link JSON.JSONElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see JSON.JSONElement
	 * @generated
	 */
	EClass getJSONElement();

	/**
	 * Returns the meta object for class '{@link JSON.JSONObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see JSON.JSONObject
	 * @generated
	 */
	EClass getJSONObject();

	/**
	 * Returns the meta object for the containment reference list '{@link JSON.JSONObject#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see JSON.JSONObject#getProperties()
	 * @see #getJSONObject()
	 * @generated
	 */
	EReference getJSONObject_Properties();

	/**
	 * Returns the meta object for class '{@link JSON.JSONArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see JSON.JSONArray
	 * @generated
	 */
	EClass getJSONArray();

	/**
	 * Returns the meta object for the containment reference list '{@link JSON.JSONArray#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see JSON.JSONArray#getElements()
	 * @see #getJSONArray()
	 * @generated
	 */
	EReference getJSONArray_Elements();

	/**
	 * Returns the meta object for class '{@link JSON.JSONValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see JSON.JSONValue
	 * @generated
	 */
	EClass getJSONValue();

	/**
	 * Returns the meta object for class '{@link JSON.JSONProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see JSON.JSONProperty
	 * @generated
	 */
	EClass getJSONProperty();

	/**
	 * Returns the meta object for the attribute '{@link JSON.JSONProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see JSON.JSONProperty#getName()
	 * @see #getJSONProperty()
	 * @generated
	 */
	EAttribute getJSONProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link JSON.JSONProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see JSON.JSONProperty#getValue()
	 * @see #getJSONProperty()
	 * @generated
	 */
	EReference getJSONProperty_Value();

	/**
	 * Returns the meta object for class '{@link JSON.JSONBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see JSON.JSONBoolean
	 * @generated
	 */
	EClass getJSONBoolean();

	/**
	 * Returns the meta object for the attribute '{@link JSON.JSONBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see JSON.JSONBoolean#isValue()
	 * @see #getJSONBoolean()
	 * @generated
	 */
	EAttribute getJSONBoolean_Value();

	/**
	 * Returns the meta object for class '{@link JSON.JSONString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see JSON.JSONString
	 * @generated
	 */
	EClass getJSONString();

	/**
	 * Returns the meta object for the attribute '{@link JSON.JSONString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see JSON.JSONString#getValue()
	 * @see #getJSONString()
	 * @generated
	 */
	EAttribute getJSONString_Value();

	/**
	 * Returns the meta object for class '{@link JSON.JSONNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null</em>'.
	 * @see JSON.JSONNull
	 * @generated
	 */
	EClass getJSONNull();

	/**
	 * Returns the meta object for class '{@link JSON.JSONNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see JSON.JSONNumber
	 * @generated
	 */
	EClass getJSONNumber();

	/**
	 * Returns the meta object for the attribute '{@link JSON.JSONNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see JSON.JSONNumber#getValue()
	 * @see #getJSONNumber()
	 * @generated
	 */
	EAttribute getJSONNumber_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JSONFactory getJSONFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link JSON.impl.JSONImpl <em>JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONImpl
		 * @see JSON.impl.JSONPackageImpl#getJSON()
		 * @generated
		 */
		EClass JSON = eINSTANCE.getJSON();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON__ELEMENTS = eINSTANCE.getJSON_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON__NAME = eINSTANCE.getJSON_Name();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONElementImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONElement()
		 * @generated
		 */
		EClass JSON_ELEMENT = eINSTANCE.getJSONElement();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONObjectImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJSONObject();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_OBJECT__PROPERTIES = eINSTANCE.getJSONObject_Properties();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONArrayImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONArray()
		 * @generated
		 */
		EClass JSON_ARRAY = eINSTANCE.getJSONArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_ARRAY__ELEMENTS = eINSTANCE.getJSONArray_Elements();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONValueImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONValue()
		 * @generated
		 */
		EClass JSON_VALUE = eINSTANCE.getJSONValue();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONPropertyImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONProperty()
		 * @generated
		 */
		EClass JSON_PROPERTY = eINSTANCE.getJSONProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_PROPERTY__NAME = eINSTANCE.getJSONProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_PROPERTY__VALUE = eINSTANCE.getJSONProperty_Value();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONBooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONBooleanImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONBoolean()
		 * @generated
		 */
		EClass JSON_BOOLEAN = eINSTANCE.getJSONBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_BOOLEAN__VALUE = eINSTANCE.getJSONBoolean_Value();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONStringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONStringImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONString()
		 * @generated
		 */
		EClass JSON_STRING = eINSTANCE.getJSONString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_STRING__VALUE = eINSTANCE.getJSONString_Value();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONNullImpl <em>Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONNullImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONNull()
		 * @generated
		 */
		EClass JSON_NULL = eINSTANCE.getJSONNull();

		/**
		 * The meta object literal for the '{@link JSON.impl.JSONNumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JSON.impl.JSONNumberImpl
		 * @see JSON.impl.JSONPackageImpl#getJSONNumber()
		 * @generated
		 */
		EClass JSON_NUMBER = eINSTANCE.getJSONNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_NUMBER__VALUE = eINSTANCE.getJSONNumber_Value();

	}

} //JSONPackage
