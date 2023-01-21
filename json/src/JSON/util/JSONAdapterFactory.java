/**
 */
package JSON.util;

import JSON.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JSON.JSONPackage
 * @generated
 */
public class JSONAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JSONPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JSONPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONSwitch<Adapter> modelSwitch =
		new JSONSwitch<Adapter>() {
			@Override
			public Adapter caseJSON(JSON object) {
				return createJSONAdapter();
			}
			@Override
			public Adapter caseJSONElement(JSONElement object) {
				return createJSONElementAdapter();
			}
			@Override
			public Adapter caseJSONObject(JSONObject object) {
				return createJSONObjectAdapter();
			}
			@Override
			public Adapter caseJSONArray(JSONArray object) {
				return createJSONArrayAdapter();
			}
			@Override
			public Adapter caseJSONValue(JSONValue object) {
				return createJSONValueAdapter();
			}
			@Override
			public Adapter caseJSONProperty(JSONProperty object) {
				return createJSONPropertyAdapter();
			}
			@Override
			public Adapter caseJSONBoolean(JSONBoolean object) {
				return createJSONBooleanAdapter();
			}
			@Override
			public Adapter caseJSONString(JSONString object) {
				return createJSONStringAdapter();
			}
			@Override
			public Adapter caseJSONNull(JSONNull object) {
				return createJSONNullAdapter();
			}
			@Override
			public Adapter caseJSONNumber(JSONNumber object) {
				return createJSONNumberAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSON
	 * @generated
	 */
	public Adapter createJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONElement
	 * @generated
	 */
	public Adapter createJSONElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONObject
	 * @generated
	 */
	public Adapter createJSONObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONArray
	 * @generated
	 */
	public Adapter createJSONArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONValue
	 * @generated
	 */
	public Adapter createJSONValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONProperty
	 * @generated
	 */
	public Adapter createJSONPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONBoolean
	 * @generated
	 */
	public Adapter createJSONBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONString
	 * @generated
	 */
	public Adapter createJSONStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONNull
	 * @generated
	 */
	public Adapter createJSONNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JSON.JSONNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JSON.JSONNumber
	 * @generated
	 */
	public Adapter createJSONNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JSONAdapterFactory
