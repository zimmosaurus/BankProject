import { useState } from "react";
import { addUser } from "./UserService";

export const FormTable = () => {
  const initialFormData = Object.freeze({
    username: "",
    email: "",
    password: "",
  });
  const [formData, setFormData] = useState(initialFormData);
  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value.trim(),
    });
  };
  const onSubmitForm = (e) => {
    e.preventDefault();
    addUser(formData);
  };
  return (
    <div>
      <form>
        <input
          type="text"
          placeholder="username"
          name="username"
          onChange={handleChange}
        />
        User
        <input
          type="text"
          placeholder="password"
          name="password"
          onChange={handleChange}
        />
        Password
        <input
          type="text"
          placeholder="email"
          name="email"
          onChange={handleChange}
        />
        Email
        <button type="submit" onClick={onSubmitForm}>
          Add User
        </button>
      </form>
      <h5>New User: {JSON.stringify(formData)}</h5>
    </div>
  );
};
