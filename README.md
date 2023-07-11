# BookStoreAPI
The Book Store API is created with Java Spring boot Framework. 


# BookStore CRUD API

This is a RESTful API for a BookStore CRUD (Create, Read, Update, Delete) application. The API allows users to manage subjects in the bookstore, including retrieving all subjects, adding a new subject, updating an existing subject, and deleting a subject.

# SubjectController

This is a RESTful API controller for managing subjects in a bookstore.



# THe URL form Postman testing - use json
- Retrieve Subject: `GET http://localhost:8090/subjects?id={id}` (optional - Formate: Parameter)
- Add a Subject: `POST http://localhost:8090/subjects`
Example
{
    "title": "Nasi Lemak",
    "author": "Mosharof",
    "isbn": "ee20023",
    "price": "150",
    "year": "2023"
}

- Update a Subject: `PUT http://localhost:8090/subjects/{id}`
{
    "title": "Nasi Lemak",
    "author": "Mosharof",
    "isbn": "ee20023",
    "price": "80",
    "year": "2019"
}
- Delete a Subject: `DELETE http://localhost:8090/subjects/{id}`

## Endpoints

### Retrieve Subject
- URL: `/subjects?id={id}`
- Method: GET
- Description: Retrieves a subject by its ID.
- Request Parameter:
  - id: The ID of the subject to retrieve.
- Response: The retrieved subject.

### Retrieve All Subject
- URL: `/subjects`
- Method: GET
- Description: Retrieves a subject by its ID.
- Request Parameter:
  - id: The ID of the subject to retrieve.
- Response: The retrieved subject.


### Retrieve Subjects
- URL: `/subjects/form`
- Method: GET
- Description: Retrieves all subjects or a specific subject by ID.
- Request Parameter (optional):
  - id: The ID of the subject to retrieve. If provided, retrieves a specific subject.
- Response: The list of retrieved subjects.

### Add a Subject
- URL: `/subjects`
- Method: POST
- Description: Adds a new subject.
- Request Body: The subject object to be added.
- Response: None.


### Delete a Subject
- URL: `/subjects/{id}`
- Method: DELETE
- Description: Deletes an existing subject.
- Request Parameter:
  - id: The ID of the subject to delete.
- Response: None.

## Testing the Endpoints

To test the endpoints, you can use tools like Postman or cURL. Here are the example URLs and request methods for testing each endpoint:

- Retrieve Subject: `GET http://localhost:8090/subjects?id={id}`
- Retrieve Subject (Form): `GET http://localhost:8090/subjects/form?id={id}` (optional)
- Add a Subject: `POST http://localhost:8090/subjects`
- Add a Subject (Form): `POST http://localhost:8090/subjects/form`
- Update a Subject: `PUT http://localhost:8090/subjects/{id}`
- Update a Subject (Form): `POST http://localhost:8090/subjects/form/update`
- Delete a Subject: `DELETE http://localhost:8090/subjects/{id}`
- Delete a Subject (Form): `POST http://localhost:8090/subjects/form/delete`

Note: Make sure to replace `{id}` with the actual ID of the subject when testing.



