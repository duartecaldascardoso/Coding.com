import React, {useEffect, useState} from 'react'
import { listPuzzles } from '../services/PuzzleService'

const ListPuzzlesComponent = () => {

  const [puzzles, setPuzzles] = useState([])

  useEffect(() =>{
    listPuzzles().then((response) =>{
        setPuzzles(response.data);
    }).catch((error) =>{
        console.log(error);
    })
  }, [])

  return (
    <div className="container">
        <h2 className='text-center'>List of Puzzles</h2>
        <table className='table table-striped table bordered'>
            <thead>
                <tr>
                    <th>Puzzle ID</th>
                    <th>Question</th>
                    <th>Answer</th>
                    <th>Answer String</th>
                </tr>
            </thead>
            <tbody>
               {
                puzzles.map(puzzle => 
                    <tr key={puzzle.id}>
                        <td>{puzzle.id}</td>
                        <td>{puzzle.question}</td>
                        <td>{puzzle.answer}</td>
                        <td>{puzzle.answerString}</td>

                    </tr>)
               }
            </tbody>
        </table>


    </div>
  )
}

export default ListPuzzlesComponent