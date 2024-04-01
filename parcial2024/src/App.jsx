import axios from "axios";
import "./App.css";
import { useEffect, useState } from "react";
/* hecho por: carlos andres montpya pacheco*/

function App() {
  const getContacts = async () => {
    let response = await axios.get("https://kpw1ch0aa1.execute-api.us-east-2.amazonaws.com/dev/project");
    setContacts(response.data);
  };

  const [contacts, setContacts] = useState([]);
  const [newContact, setNewContact] = useState({ telefono: "", nombre: "", imagen: "" });

  useEffect(() => {
    getContacts();
  }, []);

  const createContact = async () => {
    await axios.post("https://kpw1ch0aa1.execute-api.us-east-2.amazonaws.com/dev/project", {
      "image": newContact.imagen,
      "telephone": newContact.telefono,
      "names": newContact.nombre,
    });
    getContacts();
  };

  return (
    <div className="container">
      <div className="input-container">
        <label>Nombres</label>
        <input
          type="text"
          placeholder="Nombres"
          value={newContact.nombre}
          onChange={(e) => setNewContact({ ...newContact, nombre: e.target.value })}
        />
      </div>
      <div className="input-container">
        <label>Teléfono</label>
        <input
          type="text"
          placeholder="Teléfono"
          value={newContact.telefono}
          onChange={(e) => setNewContact({ ...newContact, telefono: e.target.value })}
        />
      </div>
      <div className="input-container">
        <label>Imagen</label>
        <input
          type="text"
          placeholder="Imagen"
          value={newContact.imagen}
          onChange={(e) => setNewContact({ ...newContact, imagen: e.target.value })}
        />
      </div>
      <button onClick={createContact}>Nuevo contacto</button>
      {contacts.map((contact) => (
        <div key={contact.identify} className="contact">
          <img className="contact-image" src={contact.image} alt="" />
          <div>{contact.names}</div>
        </div>
      ))}
    </div>
  );
}

export default App;