/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Behaviour</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourAllTests extends TestSuite {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(suite());
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static Test suite() {
                TestSuite suite = new BehaviourAllTests("Behaviour Tests");
                suite.addTest(BehaviourTests.suite());
                return suite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourAllTests(String name) {
                super(name);
        }

} //BehaviourAllTests
