import React, { Component } from 'react';
import '../CSS/Board.css';
import Note from './Note';

class Board extends Component {
    // constructor() {
    //     super();
    // }

    render() {
        return (
            <div>
                <div className="div-board">
                    <div className="row">
                        <Note title="Class Notes" body="Use constructors when extending another class"></Note>
                        <Note title="My Address" body="Nunya"></Note>
                        <Note title="React Notes" body="Everything in React is component"></Note>
                    </div>
                    <div>
                        <button className="btn btn-success add-button">Add</button>
                    </div>
                </div>
            </div>
        );
    }
}

export default Board;