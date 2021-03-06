import React from 'react';
import ReactDOM from 'react-dom';
import Board from './components/Board';
// import Note from './components/Note';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(<Board />, document.getElementById('root'));
// ReactDOM.render(<Note />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
