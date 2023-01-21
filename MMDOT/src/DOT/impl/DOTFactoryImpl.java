/**
 */
package DOT.impl;

import DOT.*;

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
public class DOTFactoryImpl extends EFactoryImpl implements DOTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DOTFactory init() {
		try {
			DOTFactory theDOTFactory = (DOTFactory)EPackage.Registry.INSTANCE.getEFactory(DOTPackage.eNS_URI);
			if (theDOTFactory != null) {
				return theDOTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DOTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOTFactoryImpl() {
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
			case DOTPackage.GRAPH_ROOT: return createGraphRoot();
			case DOTPackage.GRAPH_ELEMENT: return createGraphElement();
			case DOTPackage.GRAPH: return createGraph();
			case DOTPackage.LABEL: return createLabel();
			case DOTPackage.NODE_LIKE: return createNodeLike();
			case DOTPackage.NODE: return createNode();
			case DOTPackage.ARC: return createArc();
			case DOTPackage.SUB_GRAPH: return createSubGraph();
			case DOTPackage.NODE_SHAPE: return createNodeShape();
			case DOTPackage.ARROW_SHAPE: return createArrowShape();
			case DOTPackage.SHAPE: return createShape();
			case DOTPackage.SIMPLE_NODE_SHAPE: return createSimpleNodeShape();
			case DOTPackage.SIMPLE_LABEL: return createSimpleLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphRoot createGraphRoot() {
		GraphRootImpl graphRoot = new GraphRootImpl();
		return graphRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement createGraphElement() {
		GraphElementImpl graphElement = new GraphElementImpl();
		return graphElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLike createNodeLike() {
		NodeLikeImpl nodeLike = new NodeLikeImpl();
		return nodeLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGraph createSubGraph() {
		SubGraphImpl subGraph = new SubGraphImpl();
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeShape createNodeShape() {
		NodeShapeImpl nodeShape = new NodeShapeImpl();
		return nodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowShape createArrowShape() {
		ArrowShapeImpl arrowShape = new ArrowShapeImpl();
		return arrowShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNodeShape createSimpleNodeShape() {
		SimpleNodeShapeImpl simpleNodeShape = new SimpleNodeShapeImpl();
		return simpleNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLabel createSimpleLabel() {
		SimpleLabelImpl simpleLabel = new SimpleLabelImpl();
		return simpleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOTPackage getDOTPackage() {
		return (DOTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DOTPackage getPackage() {
		return DOTPackage.eINSTANCE;
	}

} //DOTFactoryImpl
