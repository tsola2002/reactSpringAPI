import fetch from "unfetch";

const checkStatus = (response) => {
  if (response.ok) {
    return response;
  }

  // return an error if theres an issue with the above response
  const error = new Error(response.statusText);
  error.response = response;
  return Promise.reject(error);
};

export const getAllStudents = () =>
  fetch("api/v1/students").then(checkStatus);
