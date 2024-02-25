import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import PuzzleComponent from './PuzzleComponent';

describe('PuzzleComponent', () => {

    test('renders question input', () => {
        render(<PuzzleComponent />);
        const questionInput = screen.getByLabelText('Question');
        expect(questionInput).toBeInTheDocument();
    });

    test('renders answer input', () => {
        render(<PuzzleComponent />);
        const answerInput = screen.getByLabelText('Answer');
        expect(answerInput).toBeInTheDocument();
    });

    test('renders answer string input', () => {
        render(<PuzzleComponent />);
        const answerStringInput = screen.getByLabelText('Answer String');
        expect(answerStringInput).toBeInTheDocument();
    });

    test('displays required error when question is empty', () => {
        render(<PuzzleComponent />);
        const submitBtn = screen.getByRole('button');
        userEvent.click(submitBtn);
        const questionError = screen.getByText('Question is required');
        expect(questionError).toBeInTheDocument();
    });

    test('displays required error when answer is empty', () => {
        render(<PuzzleComponent />);
        const submitBtn = screen.getByRole('button');
        userEvent.click(submitBtn);
        const answerError = screen.getByText('Answer is required');
        expect(answerError).toBeInTheDocument();
    });

    test('displays required error when answer string is empty', () => {
        render(<PuzzleComponent />);
        const submitBtn = screen.getByRole('button');
        userEvent.click(submitBtn);
        const answerStringError = screen.getByText('Answer String is required');
        expect(answerStringError).toBeInTheDocument();
    });

    test('calls createPuzzle on submit with form values', () => {
        const createPuzzleMock = jest.fn();
        render(<PuzzleComponent createPuzzle={createPuzzleMock} />);

        const questionInput = screen.getByLabelText('Question');
        userEvent.type(questionInput, 'Test question');

        const answerInput = screen.getByLabelText('Answer');
        userEvent.type(answerInput, '42');

        const answerStringInput = screen.getByLabelText('Answer String');
        userEvent.type(answerStringInput, 'forty two');

        const submitBtn = screen.getByRole('button');
        userEvent.click(submitBtn);

        expect(createPuzzleMock).toHaveBeenCalledWith({
            question: 'Test question',
            answer: '42',
            answerString: 'forty two'
        });
    });

});
