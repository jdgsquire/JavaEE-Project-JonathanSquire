package com.qa.penHeavenAPI.service;

import com.qa.penHeavenAPI.exceptions.AccountNotFoundException;
import com.qa.penHeavenAPI.exceptions.ItemNotFoundExcpetion;

public interface AccessService {

	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(String username) throws AccountNotFoundException;

	String updateAccount(String username, String account) throws AccountNotFoundException;

	String getAccountByUsername(String username) throws AccountNotFoundException;

	String getAccountsByFirstName(String firstName) throws AccountNotFoundException;

	String getAccountsByLastName(String lastName) throws AccountNotFoundException;

	String getAccountByEmail(String email) throws AccountNotFoundException;

	String getAllItems();

	String createItem(String item);

	String deleteItem(String itemId) throws ItemNotFoundExcpetion;

	String updateItem(String itemId, String item) throws ItemNotFoundExcpetion;

	String getItemByName(String itemName) throws ItemNotFoundExcpetion;

	String getItemsByBrand(String brand) throws ItemNotFoundExcpetion;

	String getItemsByColour(String colour) throws ItemNotFoundExcpetion;

	String getItemsByType(String type) throws ItemNotFoundExcpetion;
}