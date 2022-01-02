import axios from "axios";
import { Constants } from "../constants/Constants";
export const getAllUsers = () => {
  return axios({
    url: Constants.USER_DOMAIN + Constants.DISPLAY_ALL_USER,
    methodod: "GET",
    headers: { "Content-type": "application/json" },
  });
};

export const addUser = (data) => {
  return axios({
    url: "user_project/api/ADD_USER",
    method: "POST",
    headers: { "Content-type": "application/json" },
    data: JSON.stringify(data),
  });
};

export async function createUser(data) {
  const response = await fetch(`user_project/api/ADD_USER`, {
    method: "POST",
    headers: { "Content-type": "application/json" },
    body: JSON.stringify(data),
  });
  return response.json();
}
