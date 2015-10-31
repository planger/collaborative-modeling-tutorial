/**
 */
package org.eclipse.papyrus.training.library.profile.extlibraryprofile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage
 * @generated
 */
public class ExtLibraryProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtLibraryProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtLibraryProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtLibraryProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExtLibraryProfilePackage.BOOK: {
				Book book = (Book)theEObject;
				T result = caseBook(book);
				if (result == null) result = caseCirculatingItem(book);
				if (result == null) result = caseItem(book);
				if (result == null) result = caseLendable(book);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.CIRCULATING_ITEM: {
				CirculatingItem circulatingItem = (CirculatingItem)theEObject;
				T result = caseCirculatingItem(circulatingItem);
				if (result == null) result = caseItem(circulatingItem);
				if (result == null) result = caseLendable(circulatingItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.LENDABLE: {
				Lendable lendable = (Lendable)theEObject;
				T result = caseLendable(lendable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseAddressable(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.ADDRESSABLE: {
				Addressable addressable = (Addressable)theEObject;
				T result = caseAddressable(addressable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.WRITER: {
				Writer writer = (Writer)theEObject;
				T result = caseWriter(writer);
				if (result == null) result = casePerson(writer);
				if (result == null) result = caseAddressable(writer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseAddressable(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.VIDEO_CASSETE: {
				VideoCassete videoCassete = (VideoCassete)theEObject;
				T result = caseVideoCassete(videoCassete);
				if (result == null) result = caseAudioVisualItem(videoCassete);
				if (result == null) result = caseCirculatingItem(videoCassete);
				if (result == null) result = caseItem(videoCassete);
				if (result == null) result = caseLendable(videoCassete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM: {
				AudioVisualItem audioVisualItem = (AudioVisualItem)theEObject;
				T result = caseAudioVisualItem(audioVisualItem);
				if (result == null) result = caseCirculatingItem(audioVisualItem);
				if (result == null) result = caseItem(audioVisualItem);
				if (result == null) result = caseLendable(audioVisualItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.BOOK_ON_TAPE: {
				BookOnTape bookOnTape = (BookOnTape)theEObject;
				T result = caseBookOnTape(bookOnTape);
				if (result == null) result = caseAudioVisualItem(bookOnTape);
				if (result == null) result = caseCirculatingItem(bookOnTape);
				if (result == null) result = caseItem(bookOnTape);
				if (result == null) result = caseLendable(bookOnTape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.PERIODICAL: {
				Periodical periodical = (Periodical)theEObject;
				T result = casePeriodical(periodical);
				if (result == null) result = caseItem(periodical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.BORROWER: {
				Borrower borrower = (Borrower)theEObject;
				T result = caseBorrower(borrower);
				if (result == null) result = casePerson(borrower);
				if (result == null) result = caseAddressable(borrower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = casePerson(employee);
				if (result == null) result = caseAddressable(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtLibraryProfilePackage.BORROWS: {
				Borrows borrows = (Borrows)theEObject;
				T result = caseBorrows(borrows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circulating Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circulating Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCirculatingItem(CirculatingItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lendable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lendable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLendable(Lendable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressable(Addressable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriter(Writer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Cassete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Cassete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoCassete(VideoCassete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Visual Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Visual Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioVisualItem(AudioVisualItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book On Tape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book On Tape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookOnTape(BookOnTape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodical(Periodical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Borrower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Borrower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorrower(Borrower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Borrows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Borrows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorrows(Borrows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtLibraryProfileSwitch
