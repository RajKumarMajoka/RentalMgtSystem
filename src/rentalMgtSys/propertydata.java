package rentalMgtSys;

public class propertydata 
{
	String data[][]= {
	{"101", "1 BHK", "Fully-Furnished", "Weekly", "Mr. Ram Kumar", "98127838382", "Street 1, Block 4", "10000","5000"},
	{"102", "2 BHK", "Semi-Furnished", "Yearly", "Ms. Sam", "87364837383", "Street 3, Block 14", "4000","2300"},
	{"103", "1 BHK", "Fully-Furnished", "Monthly", "Mr. John ", "83759248373", "Street 1, Block 4", "10000","5000"},
	{"104", "3 BHK", "Not-Furnished", "Daily", "Ms. Lalita ", "78645564633", "Street 6, Block 32", "8000","55000"},
	{"105", "4 BHK", "Semi-Furnished", "Monthly", "Ms. Susan", "35745646666", "Street 11, Block 8", "15000","9000"},
	{"106", "2 BHK", "Not-Furnished", "Weekly", "Mr. Keith", "23345645543", "Street 4, Block 12", "7000","2100"},
	{"107", "1 BHK", "Fully-Furnished", "Monthly", "Mr. Neil", "75743346745", "Street 8, Block 55", "4000","1200"},
	{"108", "1 BHK", "Not-Furnished", " Yearly", "Ms. Kavita", "36674343677", "Street 1, Block 4", "10000","5000"},
	{"109", "3 BHK", "Semi-Furnished", "Half Yearly", "Ms. Geeta", "78746864564", "Street 11, Block 45", "40000","24000"},
	{"110", "2 BHK", "Not-Furnished", "Daily", "Ms. Susan", "68677678643", "Street 8, Block 55", "42000","23000"},
	{"111", "1 BHK", "Fully-Furnished", "Weekly ", "Ms. Lalita", "86556558345", "Street 1, Block 4", "40000","36000"},
	{"112", "5 BHK", "Not-Furnished", "Half Yearly", "Mr. Neil", "74656577343", "Street 11, Block 45", "50000","40000"},
	{"113", "1 BHK", "Semi-Furnished", "Monthly", "Ms. Sam", "45754375844", "Street 1, Block 4", "8000","3000"},
	{"114", "3 BHK", "Not-Furnished", "Weekly", "Mr. Ken", "74464774785", "Street 8, Block 55", "50000","40000"},
	{"115", "2 BHK", "Fully-Furnished", " Yearly", "Mr. Keith", "65456545554", "Street 1, Block 4", "25000","17000"},
	{"116", "5 BHK", "Fully-Furnished", "Half Yearly", "Ms. Seema", "64677846554", "Street 11, Block 45", "42000","35000"},
	{"117", "2 BHK", "Semi-Furnished", "Monthly", "Mr. John", "36786686884", "Street 1, Block 4", "45000","38000"},
	{"118", "4 BHK", "Semi-Furnished", "Daily", "Ms. Geeta", "46577896866", "Street 8, Block 55", "30000","25000"},
	{"119", "2 BHK", "Fully-Furnished", "Weekly ", "Mr. Ram Kumar", "98127838382", "Street 1, Block 4", "10000","5000"},
	{"120", "1 BHK", "Semi-Furnished", " Yearly", "Ms. Sam", "87364837383", "Street 11, Block 45", "15000","9000"},
	{"121", "3 BHK", "Fully-Furnished", "Monthly ", "Mr. John", "83759248373", "Street 3, Block 14", "4000","2300"},
	{"122", "5 BHK", "Not-Furnished", "Daily ", "Mrs. Lalita", "78645564633", "Street 6, Block 32", "8000","55000"},
	{"123", "2 BHK", "Semi-Furnished", "Monthly ", "Mrs. Susan", "3574546666", "Street 11, Block 8", "15000","9000"},
	{"124", "3 BHK", "Not-Furnished", "Weekly ", "Mr. Keith", "23345645543", "Street 4, Block 12", "7000","21000"},
	{"125", "2 BHK", "Fully-Furnished", "Monthly ", "Mr. Neil", "75743346745", "Street 8, Block 55", "4000","1200"},
	{"126", "1 BHK", "Not-Furnished", " Yearly", "Mrs. Kavita", "34674343677", "Street 1, Block 4", "10000","5000"},
	{"127", "4 BHK", "Semi-Furnished", "Half Yearly", "Mrs. Geeta", "78746864564", "Street 11, Block 45", "40000","24000"},
	{"128", "5 BHK", "Not-Furnished", "Daily ", "Mrs. Susan", "68677678643", "Street 8, Block 55", "42000","23000"},
	{"129", "4 BHK", "Fully-Furnished", "Weekly ", "Mrs. Lalita", "86556558345", "Street 1, Block 4", "40000","36000"},
	{"130", "1 BHK", "Not-Furnished", "Half Yearly", "Mr. Neil", "74656577343", "Street 11, Block 45", "50000","40000"},
	{"131", "2 BHK", "Semi-Furnished", "Monthly ", "Ms. Sam", "45754375844", "Street 1, Block 4", "8000","3000"},
	{"132", "5 BHK", "Not-Furnished", "Weekly ", "Mr. Ken", "744664774785", "Street 8, Block 55", "50000","40000"},
	{"133", "3 BHK", "Fully-Furnished", " Yearly", "Mr. Keith", "64456545554", "Street 1, Block 4", "25000","17000"},
	{"134", "4 BHK", "Fully-Furnished", "Half Yearly", "Ms. Seema", "64677846554", "Street 11, Block 45", "42000","35000"},
	{"135", "3 BHK", "Semi-Furnished", "Monthly ", "Mr. John", "36786686884", "Street 1, Block 4", "45000","38000"},
	{"136", "2 BHK", "Semi-Furnished", "Daily ", "Ms. Geeta", "46577896866", "Street 8, Block 55", "30000","25000"},
	};
	
	String headings[]= {"Property ID", "Apartment Type", "Furnishings", "Rental Type", "Amenities",
			"Property Owner", "Contact No.", "Address", "Security Deposit", "Rent"};
	
	String amenties1[][]= {
			{"101", "Library", "Gym"},
			{"102", "Pool", "Park", "Library"},
			{"103", "Park", "Library", "Spa"},
			{"104", "Library", "Gym", "Spa"},
			{"105", "Park","Library"},
			{"106", "Library", "Gym"},
			{"107", "Library"},
			{"108", "Park","Spa", "Gym"},
			{"109", "Park", "Gym", "Spa"},
			{"110","Park", "Library", "Pool"},
			{"111", "Park", "Library", "Pool"},
			{"112", "Spa", "Library", "Pool"},
			{"113", "Park", "Spa"},
			{"114",  "Library" },
			{"115", "Gym", "Spa"},
			{"116", "Park", "Library", "Spa"},
			{"117", "Park", "Gym", "Pool"},
			{"118",  "Library", "Spa"},
			{"119",  "Library", "Gym"},
			{"120", "Park", "Library", "Pool"},
			{"121", "Park", "Library", "Spa"},
			{"122", "Gym", "Library", "Spa"},
			{"123", "Park", "Library"},
			{"124",  "Library", "Gym"},
			{"125",  "Library"},
			{"126", "Park", "Gym", "Spa"},
			{"127", "Park", "Gym", "Spa"},
			{"128", "Park", "Library", "Pool"},
			{"129", "Park", "Library", "Pool"},
			{"130", "Spa", "Library", "Pool"},
			{"131", "Park", "Spa"},
			{"132",  "Library"},
			{"133", "Gym", "Spa"},
			{"134", "Park", "Library", "Spa"},
			{"135", "Park", "Gym", "Pool"},
			{"136", "Library", "Spa"},
			
		};
}