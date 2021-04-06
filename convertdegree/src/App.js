import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      farenheit: '',
      celsius: ''
    };
    this.handleRequest = this.handleRequest.bind(this);
    this.handleStateConvert = this.handleStateConvert.bind(this);
  }

  handleStateConvert(event) {
    const value = event.target.value;
    this.setState({farenheit: value});
  }

  handleRequest() {
    fetch('https://u5ptjv8bp7.execute-api.us-east-1.amazonaws.com/ConvertDegree/covertFarenheit?degree='+this.state.farenheit)
        .then(response => response.json())
        .then(data => {
            this.setState({celsius: data.Celcius});
        });
  }


  render() {
    return (
      <div>
          <br/>
          <input type="number" placeholder="Degree's" onChange={this.handleStateConvert}/>
          <button onClick={this.handleRequest}>Convert</button>

          <ul>
            <li><label>Farenheit: {this.state.farenheit}</label></li>
            <li><label>Celsius: {this.state.celsius}</label></li>
          </ul>
      </div>
    );
  }
}

export default App;

