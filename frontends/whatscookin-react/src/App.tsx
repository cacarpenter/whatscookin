import React from 'react';
import logo from './logo.svg';
import './App.css';
import {HomePage} from "./components/Home";
import {IngredientEditor} from "./components/ingredients/IngredientEditor";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <p>
            What's Cookin'?
        </p>
      </header>
        <HomePage title="Dingus">
            <IngredientEditor />
        </HomePage>
    </div>
  );
}

export default App;
