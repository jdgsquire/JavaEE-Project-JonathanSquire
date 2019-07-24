package com.qa.penHeavenAPI.service;

import javax.inject.Inject;

import com.qa.penHeavenAPI.exceptions.AccountNotFoundException;
import com.qa.penHeavenAPI.exceptions.ItemNotFoundExcpetion;
import com.qa.penHeavenAPI.persistence.domain.ItemType;
import com.qa.penHeavenAPI.persistence.repo.AccessRepo;
import com.qa.penHeavenAPI.util.JSONUtil;

public class AccessServiceImp implements AccessService {

	@Inject
	private AccessRepo accessRepo;

	@Inject
	JSONUtil j = new JSONUtil();

	@Override
	public String getAllAccounts() {
		return this.accessRepo.getAllAccounts();
	}

	@Override
	public String createAccount(String account) {
		String out = this.accessRepo.createAccount(account);
		if (out.equals(AccessRepo.SUCCESS_ADD_ACCOUNT)) {
			return AccessRepo.SUCCESS_ADD_ACCOUNT;
		} else {
			return AccessRepo.FAIL_ADD_ACCOUNT;
		}
	}

	@Override
	public String deleteAccount(String username) throws AccountNotFoundException {
		String out = this.accessRepo.deleteAccount(username);
		if (out.equals(AccessRepo.SUCCESS_DEL_ACCOUNT)) {
			return AccessRepo.SUCCESS_DEL_ACCOUNT;
		} else {
			return AccessRepo.FAIL_DEL_ACCOUNT;
		}

	}

	@Override
	public String updateAccount(String username, String account) throws AccountNotFoundException {
		String out = this.accessRepo.updateAccount(username, account);
		if (out.equals(AccessRepo.SUCCESS_UPDATE_ACCOUNT)) {
			return AccessRepo.SUCCESS_UPDATE_ACCOUNT;
		} else {
			return AccessRepo.FAIL_UPDATE_ACCOUNT;
		}
	}

	@Override
	public String getAccountByUsername(String username) throws AccountNotFoundException {
		return this.accessRepo.getAccountByUsername(username);
	}

	@Override
	public String getAccountsByFirstName(String firstName) throws AccountNotFoundException {
		return this.accessRepo.getAccountsByFirstName(firstName);
	}

	@Override
	public String getAccountsByLastName(String lastName) throws AccountNotFoundException {
		return this.accessRepo.getAccountsByLastName(lastName);
	}

	@Override
	public String getAccountByEmail(String email) throws AccountNotFoundException {
		return this.accessRepo.getAccountByEmail(email);
	}

	@Override
	public String getAllItems() {
		return this.accessRepo.getAllItems();
	}

	@Override
	public String createItem(String item) {
		String out = this.accessRepo.createItem(item);
		if (out.equals(AccessRepo.SUCCESS_ADD_ITEM)) {
			return out;
		} else {
			return AccessRepo.FAIL_ADD_ITEM;
		}
	}

	@Override
	public String deleteItem(Long itemId) throws ItemNotFoundExcpetion {
		String out = this.accessRepo.deleteItem(itemId);
		if (out.equals(AccessRepo.SUCCESS_DEL_ITEM)) {
			return AccessRepo.SUCCESS_DEL_ITEM;
		} else {
			return AccessRepo.FAIL_DEL_ITEM;
		}
	}

	@Override
	public String updateItem(Long itemId, String item) throws ItemNotFoundExcpetion {
		String out = this.accessRepo.updateItem(itemId, item);
		if (out.equals(AccessRepo.SUCCESS_UPDATE_ITEM)) {
			return AccessRepo.SUCCESS_UPDATE_ITEM;
		} else {
			return AccessRepo.FAIL_UPDATE_ITEM;
		}
	}

	@Override
	public String getItemByName(String itemName) throws ItemNotFoundExcpetion {
		return this.accessRepo.getItemByName(itemName);
	}

	@Override
	public String getItemsByBrand(String brand) throws ItemNotFoundExcpetion {
		return this.accessRepo.getItemsByBrand(brand);
	}

	@Override
	public String getItemsByColour(String colour) throws ItemNotFoundExcpetion {
		return this.accessRepo.getItemsByColour(colour);
	}

	@Override
	public String getItemsByType(ItemType type) throws ItemNotFoundExcpetion {
		return this.accessRepo.getItemsByType(type);
	}

}
