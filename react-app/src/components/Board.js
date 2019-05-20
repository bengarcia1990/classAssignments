import React, { Component } from 'react';
import '../CSS/Board.css';
import Note from './Note';

class Board extends Component {
    constructor() {
        super();
        this.state = {
            notes: [
                {
                    title: "Class Notes",
                    body: "Use constructors when extending another class"
                },
                {
                    title: "My Address",
                    body: "Nunya"
                },
                {
                    title: "React Notes",
                    body: "Everything in React is component"
                }
            ]
        }
    }

    render() {
        return (
            <div>
                <div className="div-board">
                    <div className="row">
                        {
                            this.state.notes.map(note => {
                                return <Note title={note.title} body={note.body} />
                            })
                        }
                    </div>
                    <div>
                        <button className="btn btn-success add-button" onClick={this.addNote.bind(this)}>Add</button>
                    </div>
                </div>
            </div>
        );
    }


    addNote() {
        this.state.notes.push(
            {
                title: "New Notes Title",
                body: "New Notes Body"
            }

        );
        this.setState(
            {
                notes: this.state.notes
            }
        )
    }
}

export default Board;