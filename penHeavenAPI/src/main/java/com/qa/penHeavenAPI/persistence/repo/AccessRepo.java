package com.qa.penHeavenAPI.persistence.repo;

public interface AccessRepo {

	public static final String SUCCESS_ADD_ACCOUNT = "Successfully created account";
	public static final String FAIL_ADD_ACCOUNT = "Failed to create account";
	public static final String SUCCESS_DEL_ACCOUNT = "Successfully deleted account";
	public static final String FAIL_DEL_ACCOUNT = "Failed to delete account";
	public static final String SUCCESS_UPDATE_ACCOUNT = "Successfully updated account details";
	public static final String FAIL_UPDATE_ACCOUNT = "Failed to update account details";

	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(String username);

	String updateAccount(String username, String account);

	String getAccountByUsername(String username);

	String getAccountsByFirstName(String firstName);

	String getAccountsByLastName(String lastName);

	String getAccountByEmail(String email);

	public static final String SUCCESS_ADD_ITEM = "Successfully added item to catalogue";
	public static final String FAIL_ADD_ITEM = "Failed to add item to catalogue";
	public static final String SUCCESS_DEL_ITEM = "Successfully deleted item from catalogue";
	public static final String FAIL_DEL_ITEM = "Failed to delete item from catalogue";
	public static final String SUCCESS_UPDATE_ITEM = "Successfully updated item details";
	public static final String FAIL_UPDATE_ITEM = "Failed to update item details";

	String getAllItems();

	String createItem(String item);

	String deleteItem(String itemId);

	String updateItem(String itemId, String item);

	String getItemByName(String itemName);

	String getItemsByBrand(String brand);

	String getItemsByColour(String colour);

	String getItemsByType(String type);

}