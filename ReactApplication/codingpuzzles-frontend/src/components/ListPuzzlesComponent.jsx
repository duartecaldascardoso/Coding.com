import React from 'react'

const ListPuzzlesComponent = () => {

  const dummyData = [
    {
        "id": 1,
        "question": "What will be the output of the following line?",
        "answer": "A",
        "answerString": "No possible output, compilation error "
    },
    {
        "id": 2,
        "question": "What will be the output of the following line?",
        "answer": "B",
        "answerString": "No possible output, compilation error "
    },
    {
        "id": 3,
        "question": "What will be the output of the following line?",
        "answer": "C",
        "answerString": "No possible output, compilation error "
    }
  ]  
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
                dummyData.map(puzzle => 
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