/**
 */
package DOT;

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
 * @see DOT.DOTFactory
 * @model kind="package"
 * @generated
 */
public interface DOTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DOT";

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
	String eNS_PREFIX = "DOT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DOTPackage eINSTANCE = DOT.impl.DOTPackageImpl.init();

	/**
	 * The meta object id for the '{@link DOT.impl.GraphRootImpl <em>Graph Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.GraphRootImpl
	 * @see DOT.impl.DOTPackageImpl#getGraphRoot()
	 * @generated
	 */
	int GRAPH_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Graph Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.GraphElementImpl
	 * @see DOT.impl.DOTPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.GraphImpl
	 * @see DOT.impl.DOTPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rank Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RANK_DIR = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABELLOC = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labeljust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABELJUST = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.LabelImpl
	 * @see DOT.impl.DOTPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodeLikeImpl <em>Node Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodeLikeImpl
	 * @see DOT.impl.DOTPackageImpl#getNodeLike()
	 * @generated
	 */
	int NODE_LIKE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__REFERS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__REFERRED_BY = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__OWNER = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE__GRAPH = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIKE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodeImpl
	 * @see DOT.impl.DOTPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NODE_LIKE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = NODE_LIKE__LABEL;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERS = NODE_LIKE__REFERS;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERRED_BY = NODE_LIKE__REFERRED_BY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNER = NODE_LIKE__OWNER;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = NODE_LIKE__GRAPH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HEIGHT = NODE_LIKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WIDTH = NODE_LIKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = NODE_LIKE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NODE_LIKE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NODE_LIKE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ArcImpl
	 * @see DOT.impl.DOTPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__CONSTRAINT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TO_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FROM_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SubGraphImpl <em>Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SubGraphImpl
	 * @see DOT.impl.DOTPackageImpl#getSubGraph()
	 * @generated
	 */
	int SUB_GRAPH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__NAME = NODE_LIKE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__LABEL = NODE_LIKE__LABEL;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__REFERS = NODE_LIKE__REFERS;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__REFERRED_BY = NODE_LIKE__REFERRED_BY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__OWNER = NODE_LIKE__OWNER;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__GRAPH = NODE_LIKE__GRAPH;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__NODES = NODE_LIKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_FEATURE_COUNT = NODE_LIKE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_OPERATION_COUNT = NODE_LIKE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__HEIGHT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PERIPHERIES = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodeShapeImpl <em>Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getNodeShape()
	 * @generated
	 */
	int NODE_SHAPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__PERIPHERIES = SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ArrowShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getArrowShape()
	 * @generated
	 */
	int ARROW_SHAPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__PERIPHERIES = SHAPE__PERIPHERIES;

	/**
	 * The feature id for the '<em><b>Clipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__CLIPPING = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Plane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__IS_PLANE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arrow Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SimpleNodeShapeImpl <em>Simple Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SimpleNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getSimpleNodeShape()
	 * @generated
	 */
	int SIMPLE_NODE_SHAPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__NAME = NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__LABEL = NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__WIDTH = NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__HEIGHT = NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__PERIPHERIES = NODE_SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Simple Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE_FEATURE_COUNT = NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE_OPERATION_COUNT = NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SimpleLabelImpl <em>Simple Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SimpleLabelImpl
	 * @see DOT.impl.DOTPackageImpl#getSimpleLabel()
	 * @generated
	 */
	int SIMPLE_LABEL = 12;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL__ELEMENT = LABEL__ELEMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL__CONTENT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DOT.GraphRoot <em>Graph Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Root</em>'.
	 * @see DOT.GraphRoot
	 * @generated
	 */
	EClass getGraphRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.GraphRoot#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see DOT.GraphRoot#getElements()
	 * @see #getGraphRoot()
	 * @generated
	 */
	EReference getGraphRoot_Elements();

	/**
	 * Returns the meta object for class '{@link DOT.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see DOT.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the attribute '{@link DOT.GraphElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DOT.GraphElement#getName()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.GraphElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see DOT.GraphElement#getLabel()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_Label();

	/**
	 * Returns the meta object for class '{@link DOT.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see DOT.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DOT.Graph#getType()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see DOT.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getRankDir <em>Rank Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank Dir</em>'.
	 * @see DOT.Graph#getRankDir()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_RankDir();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getLabelloc <em>Labelloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labelloc</em>'.
	 * @see DOT.Graph#getLabelloc()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Labelloc();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getLabeljust <em>Labeljust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labeljust</em>'.
	 * @see DOT.Graph#getLabeljust()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Labeljust();

	/**
	 * Returns the meta object for class '{@link DOT.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see DOT.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Label#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see DOT.Label#getElement()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Element();

	/**
	 * Returns the meta object for class '{@link DOT.NodeLike <em>Node Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Like</em>'.
	 * @see DOT.NodeLike
	 * @generated
	 */
	EClass getNodeLike();

	/**
	 * Returns the meta object for the reference list '{@link DOT.NodeLike#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers</em>'.
	 * @see DOT.NodeLike#getRefers()
	 * @see #getNodeLike()
	 * @generated
	 */
	EReference getNodeLike_Refers();

	/**
	 * Returns the meta object for the reference list '{@link DOT.NodeLike#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referred By</em>'.
	 * @see DOT.NodeLike#getReferredBy()
	 * @see #getNodeLike()
	 * @generated
	 */
	EReference getNodeLike_ReferredBy();

	/**
	 * Returns the meta object for the container reference '{@link DOT.NodeLike#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see DOT.NodeLike#getOwner()
	 * @see #getNodeLike()
	 * @generated
	 */
	EReference getNodeLike_Owner();

	/**
	 * Returns the meta object for the container reference '{@link DOT.NodeLike#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see DOT.NodeLike#getGraph()
	 * @see #getNodeLike()
	 * @generated
	 */
	EReference getNodeLike_Graph();

	/**
	 * Returns the meta object for class '{@link DOT.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DOT.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see DOT.Node#getHeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Height();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see DOT.Node#getWidth()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Width();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.Node#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see DOT.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Shape();

	/**
	 * Returns the meta object for class '{@link DOT.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see DOT.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#isConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see DOT.Arc#isConstraint()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Constraint();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see DOT.Arc#getToNode()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ToNode();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Node</em>'.
	 * @see DOT.Arc#getFromNode()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_FromNode();

	/**
	 * Returns the meta object for class '{@link DOT.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Graph</em>'.
	 * @see DOT.SubGraph
	 * @generated
	 */
	EClass getSubGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.SubGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see DOT.SubGraph#getNodes()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Nodes();

	/**
	 * Returns the meta object for class '{@link DOT.NodeShape <em>Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Shape</em>'.
	 * @see DOT.NodeShape
	 * @generated
	 */
	EClass getNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.ArrowShape <em>Arrow Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow Shape</em>'.
	 * @see DOT.ArrowShape
	 * @generated
	 */
	EClass getArrowShape();

	/**
	 * Returns the meta object for the attribute '{@link DOT.ArrowShape#getClipping <em>Clipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clipping</em>'.
	 * @see DOT.ArrowShape#getClipping()
	 * @see #getArrowShape()
	 * @generated
	 */
	EAttribute getArrowShape_Clipping();

	/**
	 * Returns the meta object for the attribute '{@link DOT.ArrowShape#isIsPlane <em>Is Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Plane</em>'.
	 * @see DOT.ArrowShape#isIsPlane()
	 * @see #getArrowShape()
	 * @generated
	 */
	EAttribute getArrowShape_IsPlane();

	/**
	 * Returns the meta object for class '{@link DOT.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see DOT.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see DOT.Shape#getWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see DOT.Shape#getHeight()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Height();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getPeripheries <em>Peripheries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peripheries</em>'.
	 * @see DOT.Shape#getPeripheries()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Peripheries();

	/**
	 * Returns the meta object for class '{@link DOT.SimpleNodeShape <em>Simple Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Node Shape</em>'.
	 * @see DOT.SimpleNodeShape
	 * @generated
	 */
	EClass getSimpleNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.SimpleLabel <em>Simple Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Label</em>'.
	 * @see DOT.SimpleLabel
	 * @generated
	 */
	EClass getSimpleLabel();

	/**
	 * Returns the meta object for the attribute '{@link DOT.SimpleLabel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see DOT.SimpleLabel#getContent()
	 * @see #getSimpleLabel()
	 * @generated
	 */
	EAttribute getSimpleLabel_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DOTFactory getDOTFactory();

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
		 * The meta object literal for the '{@link DOT.impl.GraphRootImpl <em>Graph Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.GraphRootImpl
		 * @see DOT.impl.DOTPackageImpl#getGraphRoot()
		 * @generated
		 */
		EClass GRAPH_ROOT = eINSTANCE.getGraphRoot();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ROOT__ELEMENTS = eINSTANCE.getGraphRoot_Elements();

		/**
		 * The meta object literal for the '{@link DOT.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.GraphElementImpl
		 * @see DOT.impl.DOTPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__NAME = eINSTANCE.getGraphElement_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ELEMENT__LABEL = eINSTANCE.getGraphElement_Label();

		/**
		 * The meta object literal for the '{@link DOT.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.GraphImpl
		 * @see DOT.impl.DOTPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__TYPE = eINSTANCE.getGraph_Type();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Rank Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__RANK_DIR = eINSTANCE.getGraph_RankDir();

		/**
		 * The meta object literal for the '<em><b>Labelloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__LABELLOC = eINSTANCE.getGraph_Labelloc();

		/**
		 * The meta object literal for the '<em><b>Labeljust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__LABELJUST = eINSTANCE.getGraph_Labeljust();

		/**
		 * The meta object literal for the '{@link DOT.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.LabelImpl
		 * @see DOT.impl.DOTPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__ELEMENT = eINSTANCE.getLabel_Element();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodeLikeImpl <em>Node Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodeLikeImpl
		 * @see DOT.impl.DOTPackageImpl#getNodeLike()
		 * @generated
		 */
		EClass NODE_LIKE = eINSTANCE.getNodeLike();

		/**
		 * The meta object literal for the '<em><b>Refers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LIKE__REFERS = eINSTANCE.getNodeLike_Refers();

		/**
		 * The meta object literal for the '<em><b>Referred By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LIKE__REFERRED_BY = eINSTANCE.getNodeLike_ReferredBy();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LIKE__OWNER = eINSTANCE.getNodeLike_Owner();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LIKE__GRAPH = eINSTANCE.getNodeLike_Graph();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodeImpl
		 * @see DOT.impl.DOTPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HEIGHT = eINSTANCE.getNode_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__WIDTH = eINSTANCE.getNode_Width();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '{@link DOT.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ArcImpl
		 * @see DOT.impl.DOTPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__CONSTRAINT = eINSTANCE.getArc_Constraint();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TO_NODE = eINSTANCE.getArc_ToNode();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__FROM_NODE = eINSTANCE.getArc_FromNode();

		/**
		 * The meta object literal for the '{@link DOT.impl.SubGraphImpl <em>Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SubGraphImpl
		 * @see DOT.impl.DOTPackageImpl#getSubGraph()
		 * @generated
		 */
		EClass SUB_GRAPH = eINSTANCE.getSubGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__NODES = eINSTANCE.getSubGraph_Nodes();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodeShapeImpl <em>Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getNodeShape()
		 * @generated
		 */
		EClass NODE_SHAPE = eINSTANCE.getNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ArrowShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getArrowShape()
		 * @generated
		 */
		EClass ARROW_SHAPE = eINSTANCE.getArrowShape();

		/**
		 * The meta object literal for the '<em><b>Clipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_SHAPE__CLIPPING = eINSTANCE.getArrowShape_Clipping();

		/**
		 * The meta object literal for the '<em><b>Is Plane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_SHAPE__IS_PLANE = eINSTANCE.getArrowShape_IsPlane();

		/**
		 * The meta object literal for the '{@link DOT.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__WIDTH = eINSTANCE.getShape_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__HEIGHT = eINSTANCE.getShape_Height();

		/**
		 * The meta object literal for the '<em><b>Peripheries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__PERIPHERIES = eINSTANCE.getShape_Peripheries();

		/**
		 * The meta object literal for the '{@link DOT.impl.SimpleNodeShapeImpl <em>Simple Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SimpleNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getSimpleNodeShape()
		 * @generated
		 */
		EClass SIMPLE_NODE_SHAPE = eINSTANCE.getSimpleNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.SimpleLabelImpl <em>Simple Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SimpleLabelImpl
		 * @see DOT.impl.DOTPackageImpl#getSimpleLabel()
		 * @generated
		 */
		EClass SIMPLE_LABEL = eINSTANCE.getSimpleLabel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LABEL__CONTENT = eINSTANCE.getSimpleLabel_Content();

	}

} //DOTPackage
