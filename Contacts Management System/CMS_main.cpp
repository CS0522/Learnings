#include <iostream>
#include <cstring>
#define MAX 1000
using namespace std;

//Contact structure.
typedef struct
{
	string m_Name;
	int m_Sex;
	int m_Age;
	string m_Phone;
	string m_Address;
}Person;

//AddressBook structure.
typedef struct
{
	Person personArray[MAX];
	int m_Size;//the number of the contacts.
}AddressBook;

//Initialize the AddressBook by using static variable.
AddressBook addBook;
void initial_size()
{
	addBook.m_Size = 0;
}

//make menu.
void showMenu()
{
	cout << "***** Contacts Management System *****" << endl;
	cout << "***** 1. Add a contact.          *****" << endl;
	cout << "***** 2. Display the contacts.   *****" << endl;
	cout << "***** 3. Delete a contact.       *****" << endl;
	cout << "***** 4. Search a contact.       *****" << endl;
	cout << "***** 5. Modify a contact.       *****" << endl;
	cout << "***** 6. Clear all contacts.     *****" << endl;
	cout << "***** 0. *EXIT*                  *****" << endl;
	cout << "**************************************" << endl;
}

//1. Function
void addPerson(AddressBook *addBook)
{
	if (addBook->m_Size >= MAX)
	{
		cout << "The number of contacts has reached the upper limit! " << endl;
		return;
	}
	string name;
	int sex;
	int age;
	string phone;
	string address;

	cout << "Input name: ";
	cin >> name;
	addBook->personArray[addBook->m_Size].m_Name = name;

	cout << "Input gender: " << endl << "1 -- Male" << endl << "2 -- Female" << endl;
	while (true)
	{
		cin >> sex;
		if (sex == 1 || sex == 2)
		{
			addBook->personArray[addBook->m_Size].m_Sex = sex;
			break;
		}
		cout << "Input again! " << endl;
	}
	
	cout << "Input age: ";
	while (true)
	{
		cin >> age;
		if (age > 0 && age < 100)
		{
			addBook->personArray[addBook->m_Size].m_Age = age;
			break;
		}
		cout << "Input again! " << endl;
	}

	cout << "Input phone number: ";
	cin >> phone;
	addBook->personArray[addBook->m_Size].m_Phone = phone;

	cout << "Input address: ";
	cin >> address;
	addBook->personArray[addBook->m_Size].m_Address = address;

	addBook->m_Size++;
	cout << "Succeeded. " << endl;
	system("pause");
	system("cls");
}

//2.Function
void showPerson(AddressBook* addBook)
{
	if (addBook->m_Size == 0)
	{
		cout << "There is no contact. " << endl;
	}
	else
	{
		for (int i = 0; i < addBook->m_Size; i++)
		{
			cout <<"Name: " << addBook->personArray[i].m_Name << '\t';
			cout << "Gender: " << (addBook->personArray[i].m_Sex == 1 ? "Male" : "Female") << '\t';
			cout << "Age: " << addBook->personArray[i].m_Age << '\t';
			cout << "Phone Number: " << addBook->personArray[i].m_Phone << '\t';
			cout << "Address: " << addBook->personArray[i].m_Address << endl;
			//cout << endl;
		}
	}
	system("pause");
	system("cls");

}

void display(AddressBook* addBook, int i)
{
	if (i < 0 || i > MAX)
	{
		return;
	}
	cout << "Name: " << addBook->personArray[i].m_Name << '\t';
	cout << "Gender: " << (addBook->personArray[i].m_Sex == 1 ? "Male" : "Female") << '\t';
	cout << "Age: " << addBook->personArray[i].m_Age << '\t';
	cout << "Phone Number: " << addBook->personArray[i].m_Phone << '\t';
	cout << "Address: " << addBook->personArray[i].m_Address << endl;
	system("pause");
	system("cls");
}


//3.Function, search by name or phone number.
void deletePerson(AddressBook* addBook, int index)
{
	showMenu();
	if (index < 0 || index >= 1000)
	{
		cout << "Error. " << endl;
		return;
	}
	else
	{
		cout << "Deleting..." << endl;
		for (int i = index + 1; i < addBook->m_Size; i++)
		{
			addBook->personArray[i - 1].m_Name = addBook->personArray[i].m_Name;
			addBook->personArray[i - 1].m_Sex = addBook->personArray[i].m_Sex;
			addBook->personArray[i - 1].m_Age = addBook->personArray[i].m_Age;
			addBook->personArray[i - 1].m_Phone = addBook->personArray[i].m_Phone;
			addBook->personArray[i - 1].m_Address = addBook->personArray[i].m_Address;
		}
		addBook->m_Size--;
		cout << "Succeeded." << endl;
		system("pause");
		system("cls");
	}
}

//4.Function, search by name or phone number.
int searchPerson(AddressBook* addBook)
{
	string value;
    cout << "Input the contact's name or phone number: ";
	cin >> value;
	int temp=0;
	for (int i = 0; i < addBook->m_Size; i++)
	{
		if (addBook->personArray[i].m_Name == value || addBook->personArray[i].m_Phone == value)
		{
			return i;
			temp = 1;
			break;
		}
	}
	if (!temp)
	{
		cout << "No such contact has been found. " << endl;
		system("pause");
		system("cls");
		return -1;
	}
	system("pause");
	system("cls");
}

//5.Function
void modifyPerson(AddressBook* addBook, int index)
{
	string name;
	int sex;
	int age;
	string phone;
	string address;
	cout << "Input the new information: " << endl;
	cout << "Name: ";
	cin >> name;
	cout << "Gender: " << endl << "1 -- Male" << endl << "2 -- Female" << endl;
	cin >> sex;
	cout << "Age: ";
	cin >> age;
	cout << "Phone number: ";
	cin >> phone;
	cout << "Address: ";
	cin >> address;
	addBook->personArray[index].m_Name = name;
	addBook->personArray[index].m_Sex = sex;
	addBook->personArray[index].m_Age = age;
	addBook->personArray[index].m_Phone = phone;
	addBook->personArray[index].m_Address = address;
	system("pause");
	system("cls");
}

//function choices.
void function()
{
	int select = 0;
	while (true)
	{
		showMenu();
	    cin >> select;
		switch (select)
		{
		case 1:// 1. Add a contact.
		{
			addPerson(&addBook);
			break;
		}
		case 2://2. Display the contacts.
		{
			showPerson(&addBook);
			break;
		}
		case 3://3. Delete a contact. 
		{
			int index;
			index = searchPerson(&addBook);
			display(&addBook, index);
			deletePerson(&addBook, index);
			break;
		}
		case 4://4. Search a contact. 
		{
			int index;
			index = searchPerson(&addBook);
			display(&addBook, index);
			break;
		}
		case 5: //5. Modify a contact. 
		{
			int index;
			index = searchPerson(&addBook);
			modifyPerson(&addBook, index);
			break;
		}
		case 6://6. Clear all contacts. 
		{
			cout << "Clearing..." << endl;
			addBook.m_Size = 0;
			cout << "Succeeded." << endl;
			system("pause");
			system("cls");
			break;
		}
		case 0://0. EXIT.
		{
			cout << "Good-Bye!" << endl;
			//system("pause");
			return;
			break;
		}
		default:
			break;
		}
	}
}


int main()
{
	function();
	system("pause");
	return 0;
}
