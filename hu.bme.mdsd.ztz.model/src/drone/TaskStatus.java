/**
 */
package drone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see drone.DronePackage#getTaskStatus()
 * @model
 * @generated
 */
public enum TaskStatus implements Enumerator {
        /**
         * The '<em><b>Ready</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #READY_VALUE
         * @generated
         * @ordered
         */
        READY(0, "Ready", "Ready"),

        /**
         * The '<em><b>Finished</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #FINISHED_VALUE
         * @generated
         * @ordered
         */
        FINISHED(1, "Finished", "Finished"), /**
         * The '<em><b>Waiting</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #WAITING_VALUE
         * @generated
         * @ordered
         */
        WAITING(2, "Waiting", "Waiting");

        /**
         * The '<em><b>Ready</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Ready</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #READY
         * @model name="Ready"
         * @generated
         * @ordered
         */
        public static final int READY_VALUE = 0;

        /**
         * The '<em><b>Finished</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Finished</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #FINISHED
         * @model name="Finished"
         * @generated
         * @ordered
         */
        public static final int FINISHED_VALUE = 1;

        /**
         * The '<em><b>Waiting</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Waiting</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #WAITING
         * @model name="Waiting"
         * @generated
         * @ordered
         */
        public static final int WAITING_VALUE = 2;

        /**
         * An array of all the '<em><b>Task Status</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final TaskStatus[] VALUES_ARRAY =
                new TaskStatus[] {
                        READY,
                        FINISHED,
                        WAITING,
                };

        /**
         * A public read-only list of all the '<em><b>Task Status</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<TaskStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Task Status</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param literal the literal.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static TaskStatus get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        TaskStatus result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Task Status</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param name the name.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static TaskStatus getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        TaskStatus result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Task Status</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the integer value.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static TaskStatus get(int value) {
                switch (value) {
                        case READY_VALUE: return READY;
                        case FINISHED_VALUE: return FINISHED;
                        case WAITING_VALUE: return WAITING;
                }
                return null;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final int value;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final String name;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final String literal;

        /**
         * Only this class can construct instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private TaskStatus(int value, String name, String literal) {
                this.value = value;
                this.name = name;
                this.literal = literal;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getValue() {
          return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
          return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getLiteral() {
          return literal;
        }

        /**
         * Returns the literal value of the enumerator, which is its string representation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                return literal;
        }
        
} //TaskStatus
