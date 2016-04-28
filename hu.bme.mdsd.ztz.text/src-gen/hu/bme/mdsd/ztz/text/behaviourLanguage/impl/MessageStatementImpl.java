/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.impl;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;

import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.MessageStatementImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.MessageStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.MessageStatementImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageStatementImpl extends AtomicStatementImpl implements MessageStatement
{
  /**
   * The cached value of the '{@link #getRobot() <em>Robot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobot()
   * @generated
   * @ordered
   */
  protected DynamicRobot robot;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected MessageTarget target;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected Message message;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicRobot getRobot()
  {
    if (robot != null && robot.eIsProxy())
    {
      InternalEObject oldRobot = (InternalEObject)robot;
      robot = (DynamicRobot)eResolveProxy(oldRobot);
      if (robot != oldRobot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT, oldRobot, robot));
      }
    }
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicRobot basicGetRobot()
  {
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRobot(DynamicRobot newRobot)
  {
    DynamicRobot oldRobot = robot;
    robot = newRobot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT, oldRobot, robot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageTarget getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(MessageTarget newTarget, NotificationChain msgs)
  {
    MessageTarget oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(MessageTarget newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE, oldMessage, newMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(Message newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE, newMessage, newMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET:
        return basicSetTarget(null, msgs);
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE:
        return basicSetMessage(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT:
        if (resolve) return getRobot();
        return basicGetRobot();
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET:
        return getTarget();
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE:
        return getMessage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT:
        setRobot((DynamicRobot)newValue);
        return;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET:
        setTarget((MessageTarget)newValue);
        return;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE:
        setMessage((Message)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT:
        setRobot((DynamicRobot)null);
        return;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET:
        setTarget((MessageTarget)null);
        return;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE:
        setMessage((Message)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__ROBOT:
        return robot != null;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__TARGET:
        return target != null;
      case BehaviourLanguagePackage.MESSAGE_STATEMENT__MESSAGE:
        return message != null;
    }
    return super.eIsSet(featureID);
  }

} //MessageStatementImpl
