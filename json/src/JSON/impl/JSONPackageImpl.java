/**
 */
package JSON.impl;

import JSON.JSONArray;
import JSON.JSONBoolean;
import JSON.JSONElement;
import JSON.JSONFactory;
import JSON.JSONNull;
import JSON.JSONNumber;
import JSON.JSONObject;
import JSON.JSONPackage;
import JSON.JSONProperty;
import JSON.JSONString;
import JSON.JSONValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JSONPackageImpl extends EPackageImpl implements JSONPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNumberEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see JSON.JSONPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JSONPackageImpl() {
		super(eNS_URI, JSONFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JSONPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JSONPackage init() {
		if (isInited) return (JSONPackage)EPackage.Registry.INSTANCE.getEPackage(JSONPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJSONPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JSONPackageImpl theJSONPackage = registeredJSONPackage instanceof JSONPackageImpl ? (JSONPackageImpl)registeredJSONPackage : new JSONPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJSONPackage.createPackageContents();

		// Initialize created meta-data
		theJSONPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJSONPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JSONPackage.eNS_URI, theJSONPackage);
		return theJSONPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSON() {
		return jsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSON_Elements() {
		return (EReference)jsonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSON_Name() {
		return (EAttribute)jsonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONElement() {
		return jsonElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONObject() {
		return jsonObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSONObject_Properties() {
		return (EReference)jsonObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONArray() {
		return jsonArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSONArray_Elements() {
		return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONValue() {
		return jsonValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONProperty() {
		return jsonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONProperty_Name() {
		return (EAttribute)jsonPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSONProperty_Value() {
		return (EReference)jsonPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONBoolean() {
		return jsonBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONBoolean_Value() {
		return (EAttribute)jsonBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONString() {
		return jsonStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONString_Value() {
		return (EAttribute)jsonStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONNull() {
		return jsonNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONNumber() {
		return jsonNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSONNumber_Value() {
		return (EAttribute)jsonNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONFactory getJSONFactory() {
		return (JSONFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jsonEClass = createEClass(JSON);
		createEReference(jsonEClass, JSON__ELEMENTS);
		createEAttribute(jsonEClass, JSON__NAME);

		jsonElementEClass = createEClass(JSON_ELEMENT);

		jsonObjectEClass = createEClass(JSON_OBJECT);
		createEReference(jsonObjectEClass, JSON_OBJECT__PROPERTIES);

		jsonArrayEClass = createEClass(JSON_ARRAY);
		createEReference(jsonArrayEClass, JSON_ARRAY__ELEMENTS);

		jsonValueEClass = createEClass(JSON_VALUE);

		jsonPropertyEClass = createEClass(JSON_PROPERTY);
		createEAttribute(jsonPropertyEClass, JSON_PROPERTY__NAME);
		createEReference(jsonPropertyEClass, JSON_PROPERTY__VALUE);

		jsonBooleanEClass = createEClass(JSON_BOOLEAN);
		createEAttribute(jsonBooleanEClass, JSON_BOOLEAN__VALUE);

		jsonStringEClass = createEClass(JSON_STRING);
		createEAttribute(jsonStringEClass, JSON_STRING__VALUE);

		jsonNullEClass = createEClass(JSON_NULL);

		jsonNumberEClass = createEClass(JSON_NUMBER);
		createEAttribute(jsonNumberEClass, JSON_NUMBER__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jsonObjectEClass.getESuperTypes().add(this.getJSONElement());
		jsonArrayEClass.getESuperTypes().add(this.getJSONElement());
		jsonValueEClass.getESuperTypes().add(this.getJSONElement());
		jsonBooleanEClass.getESuperTypes().add(this.getJSONValue());
		jsonStringEClass.getESuperTypes().add(this.getJSONValue());
		jsonNullEClass.getESuperTypes().add(this.getJSONValue());
		jsonNumberEClass.getESuperTypes().add(this.getJSONValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(jsonEClass, JSON.JSON.class, "JSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSON_Elements(), this.getJSONElement(), null, "elements", null, 0, -1, JSON.JSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSON_Name(), ecorePackage.getEString(), "name", null, 0, 1, JSON.JSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonElementEClass, JSONElement.class, "JSONElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonObjectEClass, JSONObject.class, "JSONObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSONObject_Properties(), this.getJSONProperty(), null, "properties", null, 0, -1, JSONObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonArrayEClass, JSONArray.class, "JSONArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSONArray_Elements(), this.getJSONElement(), null, "elements", null, 0, -1, JSONArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonValueEClass, JSONValue.class, "JSONValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonPropertyEClass, JSONProperty.class, "JSONProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, JSONProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSONProperty_Value(), this.getJSONElement(), null, "value", null, 1, 1, JSONProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonBooleanEClass, JSONBoolean.class, "JSONBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, JSONBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonStringEClass, JSONString.class, "JSONString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONString_Value(), ecorePackage.getEString(), "value", null, 0, 1, JSONString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonNullEClass, JSONNull.class, "JSONNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonNumberEClass, JSONNumber.class, "JSONNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONNumber_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, JSONNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JSONPackageImpl
